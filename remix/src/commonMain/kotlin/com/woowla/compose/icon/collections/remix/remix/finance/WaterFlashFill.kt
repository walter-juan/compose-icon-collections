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

public val FinanceGroup.WaterFlashFill: ImageVector
    get() {
        if (_waterFlashFill != null) {
            return _waterFlashFill!!
        }
        _waterFlashFill = Builder(name = "WaterFlashFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.641f, 6.639f)
                lineTo(12.005f, 0.275f)
                lineTo(18.369f, 6.639f)
                curveTo(21.884f, 10.153f, 21.884f, 15.852f, 18.369f, 19.367f)
                curveTo(14.854f, 22.881f, 9.156f, 22.881f, 5.641f, 19.367f)
                curveTo(2.126f, 15.852f, 2.126f, 10.153f, 5.641f, 6.639f)
                horizontalLineTo(5.641f)
                close()
                moveTo(13.005f, 11.003f)
                verticalLineTo(6.503f)
                lineTo(8.505f, 13.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(17.503f)
                lineTo(15.505f, 11.003f)
                horizontalLineTo(13.005f)
                close()
            }
        }
        .build()
        return _waterFlashFill!!
    }

private var _waterFlashFill: ImageVector? = null
