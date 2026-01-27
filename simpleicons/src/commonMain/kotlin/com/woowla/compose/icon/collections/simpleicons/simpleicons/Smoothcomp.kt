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

public val Simpleicons.Smoothcomp: ImageVector
    get() {
        if (_smoothcomp != null) {
            return _smoothcomp!!
        }
        _smoothcomp = Builder(name = "Smoothcomp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.341f, 0.0f)
                curveTo(2.845f, 0.0f, 0.0f, 2.845f, 0.0f, 6.341f)
                verticalLineToRelative(11.317f)
                curveTo(0.0f, 21.155f, 2.845f, 24.0f, 6.341f, 24.0f)
                horizontalLineToRelative(11.317f)
                curveTo(21.155f, 24.0f, 24.0f, 21.155f, 24.0f, 17.658f)
                lineTo(24.0f, 6.342f)
                curveTo(24.0f, 2.845f, 21.155f, 0.0f, 17.659f, 0.0f)
                close()
                moveTo(6.341f, 2.149f)
                horizontalLineToRelative(11.317f)
                curveToRelative(2.312f, 0.0f, 4.192f, 1.88f, 4.192f, 4.192f)
                verticalLineToRelative(11.317f)
                curveToRelative(0.0f, 2.312f, -1.88f, 4.192f, -4.192f, 4.192f)
                lineTo(6.341f, 21.85f)
                curveToRelative(-2.312f, 0.0f, -4.192f, -1.88f, -4.192f, -4.192f)
                lineTo(2.149f, 6.341f)
                curveToRelative(0.0f, -2.312f, 1.88f, -4.192f, 4.192f, -4.192f)
                close()
                moveTo(7.06f, 5.638f)
                curveToRelative(-0.763f, 0.0f, -1.384f, 0.621f, -1.384f, 1.384f)
                verticalLineToRelative(10.003f)
                curveToRelative(0.0f, 0.763f, 0.621f, 1.384f, 1.384f, 1.384f)
                horizontalLineToRelative(10.005f)
                curveToRelative(0.763f, 0.0f, 1.383f, -0.621f, 1.383f, -1.384f)
                lineTo(18.448f, 7.022f)
                curveToRelative(0.0f, -0.37f, -0.144f, -0.717f, -0.406f, -0.979f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, -0.979f, -0.405f)
                close()
                moveTo(7.825f, 7.787f)
                horizontalLineToRelative(8.474f)
                verticalLineToRelative(8.474f)
                lineTo(7.825f, 16.261f)
                close()
            }
        }
        .build()
        return _smoothcomp!!
    }

private var _smoothcomp: ImageVector? = null
