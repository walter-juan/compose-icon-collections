package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Mouse3Fill: ImageVector
    get() {
        if (_mouse3Fill != null) {
            return _mouse3Fill!!
        }
        _mouse3Fill = Builder(name = "Mouse3Fill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 0.069f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 7.0f, 0.0f)
                quadToRelative(-0.891f, 0.002f, -1.527f, 0.463f)
                curveToRelative(-0.418f, 0.302f, -0.717f, 0.726f, -0.93f, 1.208f)
                curveToRelative(-0.386f, 0.873f, -0.522f, 2.01f, -0.54f, 3.206f)
                lineToRelative(4.497f, 1.0f)
                close()
                moveTo(3.71f, 5.836f)
                lineTo(3.381f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 8.236f)
                verticalLineToRelative(2.576f)
                curveTo(2.0f, 13.659f, 4.22f, 16.0f, 7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.78f, 0.0f, 5.0f, -2.342f, 5.0f, -5.188f)
                verticalLineTo(8.123f)
                lineToRelative(-9.0f, -2.0f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.008f, 0.353f)
                curveToRelative(0.007f, 0.3f, 0.023f, 0.715f, 0.053f, 1.175f)
                curveToRelative(0.063f, 0.937f, 0.186f, 2.005f, 0.413f, 2.688f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, 0.316f)
                curveToRelative(-0.273f, -0.817f, -0.4f, -2.0f, -0.462f, -2.937f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 4.0f, 6.003f)
                quadToRelative(0.0f, -0.05f, 0.01f, -0.1f)
                close()
                moveTo(14.0f, 7.1f)
                verticalLineTo(5.187f)
                curveToRelative(0.0f, -1.13f, -0.272f, -2.044f, -0.748f, -2.772f)
                curveToRelative(-0.474f, -0.726f, -1.13f, -1.235f, -1.849f, -1.59f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 9.5f, 0.212f)
                verticalLineToRelative(5.887f)
                lineToRelative(4.5f, 1.0f)
                close()
            }
        }
        .build()
        return _mouse3Fill!!
    }

private var _mouse3Fill: ImageVector? = null
