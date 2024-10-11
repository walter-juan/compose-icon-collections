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

public val FinanceGroup.MoneyCnyBoxLine: ImageVector
    get() {
        if (_moneyCnyBoxLine != null) {
            return _moneyCnyBoxLine!!
        }
        _moneyCnyBoxLine = Builder(name = "MoneyCnyBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.005f, 3.003f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.003f, 22.005f, 3.45f, 22.005f, 4.003f)
                verticalLineTo(20.003f)
                curveTo(22.005f, 20.555f, 21.557f, 21.003f, 21.005f, 21.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.003f, 2.005f, 20.555f, 2.005f, 20.003f)
                verticalLineTo(4.003f)
                curveTo(2.005f, 3.45f, 2.453f, 3.003f, 3.005f, 3.003f)
                close()
                moveTo(4.005f, 5.003f)
                verticalLineTo(19.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.003f)
                horizontalLineTo(4.005f)
                close()
                moveTo(13.005f, 13.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(15.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(17.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(15.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(12.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(10.003f)
                horizontalLineTo(10.591f)
                lineTo(8.469f, 7.881f)
                lineTo(9.884f, 6.467f)
                lineTo(12.005f, 8.589f)
                lineTo(14.126f, 6.467f)
                lineTo(15.54f, 7.881f)
                lineTo(13.419f, 10.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(12.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(13.003f)
                close()
            }
        }
        .build()
        return _moneyCnyBoxLine!!
    }

private var _moneyCnyBoxLine: ImageVector? = null
