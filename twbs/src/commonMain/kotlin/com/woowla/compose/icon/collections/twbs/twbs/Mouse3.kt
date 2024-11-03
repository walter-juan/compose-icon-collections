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

public val Twbs.Mouse3: ImageVector
    get() {
        if (_mouse3 != null) {
            return _mouse3!!
        }
        _mouse3 = Builder(name = "Mouse3", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 0.0f)
                quadToRelative(-0.891f, 0.002f, -1.527f, 0.463f)
                curveToRelative(-0.418f, 0.302f, -0.717f, 0.726f, -0.93f, 1.208f)
                curveTo(4.123f, 2.619f, 4.0f, 3.879f, 4.0f, 5.187f)
                verticalLineToRelative(0.504f)
                lineTo(3.382f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 8.236f)
                verticalLineToRelative(2.576f)
                curveTo(2.0f, 13.659f, 4.22f, 16.0f, 7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.78f, 0.0f, 5.0f, -2.342f, 5.0f, -5.188f)
                lineTo(14.0f, 5.186f)
                curveToRelative(0.0f, -1.13f, -0.272f, -2.044f, -0.748f, -2.772f)
                curveToRelative(-0.474f, -0.726f, -1.13f, -1.235f, -1.849f, -1.59f)
                curveTo(9.981f, 0.123f, 8.26f, 0.0f, 7.0f, 0.0f)
                moveToRelative(2.5f, 6.099f)
                lineTo(9.5f, 1.232f)
                curveToRelative(0.51f, 0.11f, 1.008f, 0.267f, 1.46f, 0.49f)
                curveToRelative(0.596f, 0.293f, 1.099f, 0.694f, 1.455f, 1.24f)
                curveToRelative(0.355f, 0.543f, 0.585f, 1.262f, 0.585f, 2.225f)
                verticalLineToRelative(1.69f)
                close()
                moveTo(8.5f, 1.074f)
                verticalLineToRelative(4.803f)
                lineTo(5.0f, 5.099f)
                curveToRelative(0.006f, -1.242f, 0.134f, -2.293f, 0.457f, -3.024f)
                curveToRelative(0.162f, -0.366f, 0.363f, -0.63f, 0.602f, -0.801f)
                curveTo(6.292f, 1.105f, 6.593f, 1.0f, 7.0f, 1.0f)
                curveToRelative(0.468f, 0.0f, 0.98f, 0.018f, 1.5f, 0.074f)
                moveTo(5.0f, 6.124f)
                lineTo(13.0f, 7.9f)
                verticalLineToRelative(2.912f)
                curveTo(13.0f, 13.145f, 11.19f, 15.0f, 9.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                curveToRelative(-2.19f, 0.0f, -4.0f, -1.855f, -4.0f, -4.188f)
                lineTo(3.0f, 8.236f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, -1.342f)
                lineToRelative(0.187f, -0.093f)
                curveToRelative(0.01f, 0.265f, 0.024f, 0.58f, 0.047f, 0.92f)
                curveToRelative(0.062f, 0.938f, 0.19f, 2.12f, 0.462f, 2.937f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.948f, -0.316f)
                curveToRelative(-0.227f, -0.683f, -0.35f, -1.75f, -0.413f, -2.688f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -0.06f, -1.528f)
                verticalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _mouse3!!
    }

private var _mouse3: ImageVector? = null
