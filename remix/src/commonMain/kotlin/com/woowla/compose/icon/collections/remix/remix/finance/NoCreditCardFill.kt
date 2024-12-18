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

public val FinanceGroup.NoCreditCardFill: ImageVector
    get() {
        if (_noCreditCardFill != null) {
            return _noCreditCardFill!!
        }
        _noCreditCardFill = Builder(name = "NoCreditCardFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.586f, 21.0f)
                lineTo(21.192f, 22.607f)
                lineTo(22.607f, 21.192f)
                lineTo(2.808f, 1.393f)
                lineTo(1.394f, 2.808f)
                lineTo(2.12f, 3.534f)
                curveTo(2.046f, 3.673f, 2.005f, 3.832f, 2.005f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.586f)
                lineTo(9.586f, 11.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(20.0f)
                curveTo(2.005f, 20.552f, 2.452f, 21.0f, 3.005f, 21.0f)
                horizontalLineTo(19.586f)
                close()
                moveTo(22.005f, 11.0f)
                verticalLineTo(17.762f)
                lineTo(15.243f, 11.0f)
                horizontalLineTo(22.005f)
                close()
                moveTo(22.005f, 7.0f)
                horizontalLineTo(11.243f)
                lineTo(7.243f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.448f, 22.005f, 4.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _noCreditCardFill!!
    }

private var _noCreditCardFill: ImageVector? = null
