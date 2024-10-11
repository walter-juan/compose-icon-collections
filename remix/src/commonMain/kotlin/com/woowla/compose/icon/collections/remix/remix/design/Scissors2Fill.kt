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

public val DesignGroup.Scissors2Fill: ImageVector
    get() {
        if (_scissors2Fill != null) {
            return _scissors2Fill!!
        }
        _scissors2Fill = Builder(name = "Scissors2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.118f)
                lineTo(9.683f, 16.434f)
                curveTo(9.887f, 16.914f, 10.0f, 17.442f, 10.0f, 17.997f)
                curveTo(10.0f, 20.206f, 8.209f, 21.997f, 6.0f, 21.997f)
                curveTo(3.791f, 21.997f, 2.0f, 20.206f, 2.0f, 17.997f)
                curveTo(2.0f, 15.788f, 3.791f, 13.997f, 6.0f, 13.997f)
                curveTo(6.554f, 13.997f, 7.082f, 14.109f, 7.562f, 14.313f)
                lineTo(9.879f, 11.997f)
                lineTo(4.211f, 6.329f)
                curveTo(3.43f, 5.548f, 3.43f, 4.282f, 4.211f, 3.501f)
                lineTo(4.919f, 2.794f)
                lineTo(12.0f, 9.875f)
                lineTo(19.081f, 2.794f)
                lineTo(19.789f, 3.501f)
                curveTo(20.57f, 4.282f, 20.57f, 5.548f, 19.789f, 6.329f)
                lineTo(14.121f, 11.997f)
                lineTo(16.438f, 14.313f)
                curveTo(16.918f, 14.109f, 17.446f, 13.997f, 18.0f, 13.997f)
                curveTo(20.209f, 13.997f, 22.0f, 15.788f, 22.0f, 17.997f)
                curveTo(22.0f, 20.206f, 20.209f, 21.997f, 18.0f, 21.997f)
                curveTo(15.791f, 21.997f, 14.0f, 20.206f, 14.0f, 17.997f)
                curveTo(14.0f, 17.442f, 14.113f, 16.914f, 14.316f, 16.434f)
                lineTo(12.0f, 14.118f)
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
        return _scissors2Fill!!
    }

private var _scissors2Fill: ImageVector? = null
