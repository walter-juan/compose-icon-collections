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

public val Simpleicons.Radiofrance: ImageVector
    get() {
        if (_radiofrance != null) {
            return _radiofrance!!
        }
        _radiofrance = Builder(name = "Radiofrance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(6.144f, 24.0f, 1.397f, 19.497f, 1.397f, 13.94f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, 0.208f, -1.991f)
                horizontalLineToRelative(5.99f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -0.474f, 1.991f)
                curveToRelative(0.0f, 2.557f, 2.184f, 4.63f, 4.88f, 4.63f)
                curveToRelative(0.6f, 0.0f, 1.175f, -0.104f, 1.706f, -0.292f)
                verticalLineToRelative(5.592f)
                quadTo(12.872f, 24.0f, 12.0f, 24.0f)
                moveToRelative(10.355f, -7.888f)
                horizontalLineTo(16.31f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 0.57f, -2.172f)
                curveToRelative(0.0f, -2.557f, -2.184f, -4.63f, -4.879f, -4.63f)
                curveToRelative(-0.504f, 0.0f, -0.99f, 0.073f, -1.448f, 0.208f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(4.546f)
                curveToRelative(3.978f, 1.45f, 6.802f, 5.109f, 6.802f, 9.394f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -0.249f, 2.172f)
            }
        }
        .build()
        return _radiofrance!!
    }

private var _radiofrance: ImageVector? = null
