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

public val FinanceGroup.CashLine: ImageVector
    get() {
        if (_cashLine != null) {
            return _cashLine!!
        }
        _cashLine = Builder(name = "CashLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(14.21f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.21f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(21.005f, 4.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 4.003f, 2.005f, 4.451f, 2.005f, 5.003f)
                verticalLineTo(19.003f)
                curveTo(2.005f, 19.555f, 2.453f, 20.003f, 3.005f, 20.003f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 20.003f, 22.005f, 19.555f, 22.005f, 19.003f)
                verticalLineTo(5.003f)
                curveTo(22.005f, 4.451f, 21.557f, 4.003f, 21.005f, 4.003f)
                close()
                moveTo(4.005f, 15.646f)
                verticalLineTo(8.354f)
                curveTo(5.131f, 8.017f, 6.018f, 7.129f, 6.355f, 6.003f)
                horizontalLineTo(17.646f)
                curveTo(17.983f, 7.132f, 18.875f, 8.022f, 20.005f, 8.356f)
                verticalLineTo(15.644f)
                curveTo(18.873f, 15.979f, 17.98f, 16.871f, 17.644f, 18.003f)
                horizontalLineTo(6.356f)
                curveTo(6.021f, 16.874f, 5.133f, 15.984f, 4.005f, 15.646f)
                close()
            }
        }
        .build()
        return _cashLine!!
    }

private var _cashLine: ImageVector? = null
