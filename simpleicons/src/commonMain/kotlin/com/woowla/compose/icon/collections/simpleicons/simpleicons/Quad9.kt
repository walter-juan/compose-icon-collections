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

public val Simpleicons.Quad9: ImageVector
    get() {
        if (_quad9 != null) {
            return _quad9!!
        }
        _quad9 = Builder(name = "Quad9", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.822f, 24.0f)
                horizontalLineToRelative(5.608f)
                lineToRelative(6.331f, -9.48f)
                curveToRelative(1.463f, -2.185f, 2.288f, -4.197f, 2.288f, -6.4f)
                curveTo(21.05f, 3.458f, 17.144f, 0.0f, 12.0f, 0.0f)
                curveTo(6.822f, 0.0f, 2.95f, 3.493f, 2.95f, 8.207f)
                curveToRelative(0.0f, 4.507f, 3.459f, 8.0f, 8.345f, 8.0f)
                curveToRelative(0.413f, 0.0f, 0.757f, -0.018f, 1.083f, -0.07f)
                close()
                moveTo(12.0f, 12.129f)
                curveToRelative(-2.426f, 0.0f, -4.215f, -1.634f, -4.215f, -3.957f)
                curveToRelative(0.0f, -2.34f, 1.79f, -3.957f, 4.215f, -3.957f)
                curveToRelative(2.409f, 0.0f, 4.215f, 1.617f, 4.215f, 3.957f)
                curveToRelative(0.0f, 2.323f, -1.806f, 3.957f, -4.215f, 3.957f)
                close()
            }
        }
        .build()
        return _quad9!!
    }

private var _quad9: ImageVector? = null
