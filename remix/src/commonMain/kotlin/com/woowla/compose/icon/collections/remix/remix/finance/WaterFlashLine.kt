package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.WaterFlashLine: ImageVector
    get() {
        if (_waterFlashLine != null) {
            return _waterFlashLine!!
        }
        _waterFlashLine = Builder(name = "WaterFlashLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 3.103f)
                lineTo(7.055f, 8.053f)
                curveTo(4.321f, 10.787f, 4.321f, 15.219f, 7.055f, 17.952f)
                curveTo(9.789f, 20.686f, 14.221f, 20.686f, 16.955f, 17.952f)
                curveTo(19.688f, 15.219f, 19.688f, 10.787f, 16.955f, 8.053f)
                lineTo(12.005f, 3.103f)
                close()
                moveTo(12.005f, 0.275f)
                lineTo(18.369f, 6.639f)
                curveTo(21.884f, 10.153f, 21.884f, 15.852f, 18.369f, 19.367f)
                curveTo(14.854f, 22.881f, 9.156f, 22.881f, 5.641f, 19.367f)
                curveTo(2.126f, 15.852f, 2.126f, 10.153f, 5.641f, 6.639f)
                lineTo(12.005f, 0.275f)
                close()
                moveTo(13.005f, 11.003f)
                horizontalLineTo(15.505f)
                lineTo(11.005f, 17.503f)
                verticalLineTo(13.003f)
                horizontalLineTo(8.505f)
                lineTo(13.005f, 6.503f)
                verticalLineTo(11.003f)
                close()
            }
        }
        .build()
        return _waterFlashLine!!
    }

private var _waterFlashLine: ImageVector? = null
