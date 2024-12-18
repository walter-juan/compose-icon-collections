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

public val FinanceGroup.NoCreditCardLine: ImageVector
    get() {
        if (_noCreditCardLine != null) {
            return _noCreditCardLine!!
        }
        _noCreditCardLine = Builder(name = "NoCreditCardLine", defaultWidth = 24.0.dp, defaultHeight
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
                verticalLineTo(20.0f)
                curveTo(2.005f, 20.552f, 2.452f, 21.0f, 3.005f, 21.0f)
                horizontalLineTo(19.586f)
                close()
                moveTo(17.586f, 19.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.586f)
                lineTo(17.586f, 19.0f)
                close()
                moveTo(6.586f, 8.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(5.419f)
                lineTo(6.586f, 8.0f)
                close()
                moveTo(22.005f, 4.0f)
                verticalLineTo(17.762f)
                lineTo(20.005f, 15.762f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.243f)
                lineTo(12.243f, 8.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.243f)
                lineTo(7.243f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.448f, 22.005f, 4.0f)
                close()
            }
        }
        .build()
        return _noCreditCardLine!!
    }

private var _noCreditCardLine: ImageVector? = null
