package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.ScreenshotFill: ImageVector
    get() {
        if (_screenshotFill != null) {
            return _screenshotFill!!
        }
        _screenshotFill = Builder(name = "ScreenshotFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 14.407f)
                lineTo(10.441f, 15.959f)
                curveTo(10.796f, 16.556f, 11.0f, 17.254f, 11.0f, 18.0f)
                curveTo(11.0f, 20.209f, 9.209f, 22.0f, 7.0f, 22.0f)
                curveTo(4.791f, 22.0f, 3.0f, 20.209f, 3.0f, 18.0f)
                curveTo(3.0f, 15.791f, 4.791f, 14.0f, 7.0f, 14.0f)
                curveTo(7.738f, 14.0f, 8.429f, 14.2f, 9.023f, 14.548f)
                lineTo(10.578f, 12.993f)
                lineTo(7.454f, 9.868f)
                curveTo(6.868f, 9.282f, 6.868f, 8.333f, 7.454f, 7.747f)
                lineTo(7.808f, 7.393f)
                lineTo(11.993f, 11.578f)
                lineTo(16.182f, 7.389f)
                lineTo(16.535f, 7.743f)
                curveTo(17.121f, 8.328f, 17.121f, 9.278f, 16.535f, 9.864f)
                lineTo(13.407f, 12.993f)
                lineTo(14.968f, 14.554f)
                curveTo(15.564f, 14.202f, 16.258f, 14.0f, 17.0f, 14.0f)
                curveTo(19.209f, 14.0f, 21.0f, 15.791f, 21.0f, 18.0f)
                curveTo(21.0f, 20.209f, 19.209f, 22.0f, 17.0f, 22.0f)
                curveTo(14.791f, 22.0f, 13.0f, 20.209f, 13.0f, 18.0f)
                curveTo(13.0f, 17.258f, 13.202f, 16.563f, 13.554f, 15.968f)
                lineTo(11.993f, 14.407f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(7.0f, 20.0f)
                curveTo(8.105f, 20.0f, 9.0f, 19.105f, 9.0f, 18.0f)
                curveTo(9.0f, 16.895f, 8.105f, 16.0f, 7.0f, 16.0f)
                curveTo(5.895f, 16.0f, 5.0f, 16.895f, 5.0f, 18.0f)
                curveTo(5.0f, 19.105f, 5.895f, 20.0f, 7.0f, 20.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveTo(18.105f, 20.0f, 19.0f, 19.105f, 19.0f, 18.0f)
                curveTo(19.0f, 16.895f, 18.105f, 16.0f, 17.0f, 16.0f)
                curveTo(15.895f, 16.0f, 15.0f, 16.895f, 15.0f, 18.0f)
                curveTo(15.0f, 19.105f, 15.895f, 20.0f, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _screenshotFill!!
    }

private var _screenshotFill: ImageVector? = null
