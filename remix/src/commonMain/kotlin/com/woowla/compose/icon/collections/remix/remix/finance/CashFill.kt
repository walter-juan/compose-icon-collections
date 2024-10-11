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

public val FinanceGroup.CashFill: ImageVector
    get() {
        if (_cashFill != null) {
            return _cashFill!!
        }
        _cashFill = Builder(name = "CashFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.005f, 4.003f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 4.003f, 22.005f, 4.451f, 22.005f, 5.003f)
                verticalLineTo(19.003f)
                curveTo(22.005f, 19.555f, 21.557f, 20.003f, 21.005f, 20.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 20.003f, 2.005f, 19.555f, 2.005f, 19.003f)
                verticalLineTo(5.003f)
                curveTo(2.005f, 4.451f, 2.453f, 4.003f, 3.005f, 4.003f)
                close()
                moveTo(6.5f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.5f)
                curveTo(5.381f, 8.5f, 6.5f, 7.381f, 6.5f, 6.0f)
                close()
                moveTo(17.5f, 6.0f)
                curveTo(17.5f, 7.381f, 18.62f, 8.5f, 20.0f, 8.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.5f)
                close()
                moveTo(4.0f, 15.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.5f)
                curveTo(6.5f, 16.619f, 5.381f, 15.5f, 4.0f, 15.5f)
                close()
                moveTo(17.5f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.5f)
                curveTo(18.62f, 15.5f, 17.5f, 16.619f, 17.5f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(14.21f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.21f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cashFill!!
    }

private var _cashFill: ImageVector? = null
