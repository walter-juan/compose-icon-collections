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

public val DesignGroup.Scissors2Line: ImageVector
    get() {
        if (_scissors2Line != null) {
            return _scissors2Line!!
        }
        _scissors2Line = Builder(name = "Scissors2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.411f)
                lineTo(9.446f, 15.965f)
                curveTo(9.798f, 16.56f, 10.0f, 17.255f, 10.0f, 17.997f)
                curveTo(10.0f, 20.206f, 8.209f, 21.997f, 6.0f, 21.997f)
                curveTo(3.791f, 21.997f, 2.0f, 20.206f, 2.0f, 17.997f)
                curveTo(2.0f, 15.787f, 3.791f, 13.997f, 6.0f, 13.997f)
                curveTo(6.742f, 13.997f, 7.436f, 14.198f, 8.032f, 14.55f)
                lineTo(10.586f, 11.997f)
                lineTo(4.565f, 5.976f)
                curveTo(3.784f, 5.195f, 3.784f, 3.928f, 4.565f, 3.147f)
                lineTo(12.0f, 10.582f)
                lineTo(19.435f, 3.147f)
                curveTo(20.216f, 3.928f, 20.216f, 5.195f, 19.435f, 5.976f)
                lineTo(13.414f, 11.997f)
                lineTo(15.968f, 14.55f)
                curveTo(16.563f, 14.198f, 17.258f, 13.997f, 18.0f, 13.997f)
                curveTo(20.209f, 13.997f, 22.0f, 15.787f, 22.0f, 17.997f)
                curveTo(22.0f, 20.206f, 20.209f, 21.997f, 18.0f, 21.997f)
                curveTo(15.791f, 21.997f, 14.0f, 20.206f, 14.0f, 17.997f)
                curveTo(14.0f, 17.255f, 14.202f, 16.56f, 14.554f, 15.965f)
                lineTo(12.0f, 13.411f)
                close()
                moveTo(6.0f, 19.997f)
                curveTo(7.105f, 19.997f, 8.0f, 19.101f, 8.0f, 17.997f)
                curveTo(8.0f, 16.892f, 7.105f, 15.997f, 6.0f, 15.997f)
                curveTo(4.895f, 15.997f, 4.0f, 16.892f, 4.0f, 17.997f)
                curveTo(4.0f, 19.101f, 4.895f, 19.997f, 6.0f, 19.997f)
                close()
                moveTo(18.0f, 19.997f)
                curveTo(19.105f, 19.997f, 20.0f, 19.101f, 20.0f, 17.997f)
                curveTo(20.0f, 16.892f, 19.105f, 15.997f, 18.0f, 15.997f)
                curveTo(16.895f, 15.997f, 16.0f, 16.892f, 16.0f, 17.997f)
                curveTo(16.0f, 19.101f, 16.895f, 19.997f, 18.0f, 19.997f)
                close()
            }
        }
        .build()
        return _scissors2Line!!
    }

private var _scissors2Line: ImageVector? = null
