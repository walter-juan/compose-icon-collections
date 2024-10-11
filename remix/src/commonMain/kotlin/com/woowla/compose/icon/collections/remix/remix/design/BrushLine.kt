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

public val DesignGroup.BrushLine: ImageVector
    get() {
        if (_brushLine != null) {
            return _brushLine!!
        }
        _brushLine = Builder(name = "BrushLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.457f, 9.675f)
                lineTo(15.314f, 9.533f)
                curveTo(14.666f, 8.908f, 13.855f, 8.434f, 12.924f, 8.184f)
                curveTo(10.017f, 7.405f, 7.225f, 9.053f, 6.432f, 12.014f)
                curveTo(6.389f, 12.174f, 6.366f, 12.354f, 6.328f, 12.805f)
                curveTo(6.174f, 14.675f, 5.734f, 16.07f, 4.529f, 17.484f)
                curveTo(6.788f, 18.373f, 9.466f, 18.999f, 11.502f, 18.999f)
                curveTo(13.97f, 18.999f, 16.164f, 17.339f, 16.813f, 14.92f)
                curveTo(17.331f, 12.987f, 16.751f, 11.018f, 15.457f, 9.675f)
                close()
                moveTo(13.289f, 6.213f)
                lineTo(18.228f, 2.371f)
                curveTo(18.626f, 2.062f, 19.192f, 2.097f, 19.549f, 2.454f)
                lineTo(22.543f, 5.448f)
                curveTo(22.9f, 5.804f, 22.935f, 6.371f, 22.625f, 6.769f)
                lineTo(18.785f, 11.707f)
                curveTo(19.078f, 12.895f, 19.084f, 14.172f, 18.744f, 15.438f)
                curveTo(17.846f, 18.79f, 14.814f, 20.999f, 11.502f, 20.999f)
                curveTo(8.0f, 20.999f, 3.5f, 19.497f, 1.0f, 17.997f)
                curveTo(4.98f, 14.997f, 4.047f, 13.186f, 4.5f, 11.497f)
                curveTo(5.558f, 7.547f, 9.342f, 5.239f, 13.289f, 6.213f)
                close()
                moveTo(16.701f, 8.092f)
                curveTo(16.767f, 8.155f, 16.832f, 8.22f, 16.895f, 8.285f)
                lineTo(18.03f, 9.42f)
                lineTo(20.505f, 6.238f)
                lineTo(18.759f, 4.492f)
                lineTo(15.577f, 6.967f)
                lineTo(16.701f, 8.092f)
                close()
            }
        }
        .build()
        return _brushLine!!
    }

private var _brushLine: ImageVector? = null
