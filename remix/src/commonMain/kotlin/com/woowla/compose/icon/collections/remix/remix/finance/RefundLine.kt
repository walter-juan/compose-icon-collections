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

public val FinanceGroup.RefundLine: ImageVector
    get() {
        if (_refundLine != null) {
            return _refundLine!!
        }
        _refundLine = Builder(name = "RefundLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.005f)
                close()
                moveTo(20.005f, 10.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.448f, 22.005f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.448f, 2.453f, 3.0f, 3.005f, 3.0f)
                close()
                moveTo(11.005f, 14.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.505f)
                lineTo(11.005f, 11.5f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _refundLine!!
    }

private var _refundLine: ImageVector? = null
