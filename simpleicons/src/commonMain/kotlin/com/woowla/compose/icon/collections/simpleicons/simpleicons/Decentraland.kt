package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Decentraland: ImageVector
    get() {
        if (_decentraland != null) {
            return _decentraland!!
        }
        _decentraland = Builder(name = "Decentraland", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.925f, 18.978f)
                horizontalLineToRelative(3.134f)
                lineToRelative(-3.134f, -3.778f)
                close()
                moveTo(8.418f, 9.556f)
                verticalLineToRelative(6.622f)
                horizontalLineToRelative(5.507f)
                close()
                moveTo(12.044f, 0.0f)
                curveTo(5.418f, 0.0f, 0.0f, 5.333f, 0.0f, 11.955f)
                curveToRelative(0.0f, 1.467f, 0.269f, 2.889f, 0.761f, 4.178f)
                lineToRelative(4.656f, -5.556f)
                lineTo(8.104f, 7.333f)
                lineToRelative(6.537f, 7.822f)
                lineToRelative(1.88f, -2.267f)
                lineToRelative(4.925f, 5.867f)
                horizontalLineToRelative(0.403f)
                curveToRelative(1.388f, -1.956f, 2.149f, -4.311f, 2.149f, -6.844f)
                curveTo(24.088f, 5.333f, 18.671f, 0.0f, 12.044f, 0.0f)
                close()
                moveTo(8.059f, 6.267f)
                curveToRelative(-0.94f, 0.0f, -1.657f, -0.756f, -1.657f, -1.644f)
                curveToRelative(0.0f, -0.889f, 0.761f, -1.644f, 1.657f, -1.644f)
                curveToRelative(0.94f, 0.0f, 1.657f, 0.756f, 1.657f, 1.644f)
                curveToRelative(0.0f, 0.889f, -0.716f, 1.644f, -1.657f, 1.644f)
                close()
                moveTo(16.79f, 11.644f)
                curveToRelative(-1.836f, 0.0f, -3.313f, -1.467f, -3.313f, -3.289f)
                curveToRelative(0.0f, -1.822f, 1.477f, -3.289f, 3.313f, -3.289f)
                curveToRelative(1.836f, 0.0f, 3.313f, 1.467f, 3.313f, 3.289f)
                curveToRelative(0.045f, 1.822f, -1.478f, 3.289f, -3.313f, 3.289f)
                close()
                moveTo(12.805f, 17.378f)
                lineTo(1.164f, 17.378f)
                curveToRelative(0.269f, 0.533f, 0.582f, 1.022f, 0.896f, 1.511f)
                horizontalLineToRelative(9.447f)
                close()
                moveTo(4.478f, 21.422f)
                horizontalLineToRelative(14.999f)
                curveToRelative(0.493f, -0.4f, 1.03f, -0.889f, 1.343f, -1.244f)
                lineTo(3.134f, 20.178f)
                curveToRelative(0.448f, 0.444f, 0.895f, 0.889f, 1.343f, 1.244f)
                close()
                moveTo(12.044f, 24.0f)
                curveToRelative(1.97f, 0.0f, 3.851f, -0.444f, 5.507f, -1.289f)
                lineTo(6.537f, 22.711f)
                curveTo(8.194f, 23.555f, 10.03f, 24.0f, 12.044f, 24.0f)
                close()
            }
        }
        .build()
        return _decentraland!!
    }

private var _decentraland: ImageVector? = null
