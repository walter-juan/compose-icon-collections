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

public val FinanceGroup.SecurePaymentLine: ImageVector
    get() {
        if (_securePaymentLine != null) {
            return _securePaymentLine!!
        }
        _securePaymentLine = Builder(name = "SecurePaymentLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.005f, 2.0f)
                lineTo(18.303f, 4.281f)
                curveTo(18.721f, 4.411f, 19.005f, 4.798f, 19.005f, 5.235f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 7.0f, 22.005f, 7.448f, 22.005f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.005f, 16.552f, 21.557f, 17.0f, 21.005f, 17.0f)
                lineTo(17.785f, 17.001f)
                curveTo(17.398f, 17.511f, 16.928f, 17.962f, 16.385f, 18.332f)
                lineTo(11.005f, 22.0f)
                lineTo(5.625f, 18.332f)
                curveTo(3.986f, 17.214f, 3.005f, 15.358f, 3.005f, 13.374f)
                verticalLineTo(5.235f)
                curveTo(3.005f, 4.798f, 3.289f, 4.411f, 3.707f, 4.281f)
                lineTo(11.005f, 2.0f)
                close()
                moveTo(11.005f, 4.094f)
                lineTo(5.005f, 5.97f)
                verticalLineTo(13.374f)
                curveTo(5.005f, 14.619f, 5.584f, 15.788f, 6.563f, 16.543f)
                lineTo(6.752f, 16.679f)
                lineTo(11.005f, 19.579f)
                lineTo(14.787f, 17.0f)
                horizontalLineTo(10.005f)
                curveTo(9.453f, 17.0f, 9.005f, 16.552f, 9.005f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(9.005f, 7.448f, 9.453f, 7.0f, 10.005f, 7.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(5.97f)
                lineTo(11.005f, 4.094f)
                close()
                moveTo(11.005f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.005f)
                close()
                moveTo(11.005f, 10.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _securePaymentLine!!
    }

private var _securePaymentLine: ImageVector? = null
