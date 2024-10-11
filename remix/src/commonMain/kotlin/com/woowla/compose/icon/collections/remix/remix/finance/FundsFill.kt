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

public val FinanceGroup.FundsFill: ImageVector
    get() {
        if (_fundsFill != null) {
            return _fundsFill!!
        }
        _fundsFill = Builder(name = "FundsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.901f, 17.864f)
                lineTo(7.812f, 13.953f)
                lineTo(10.641f, 16.781f)
                lineTo(15.212f, 12.21f)
                lineTo(17.005f, 14.003f)
                verticalLineTo(9.003f)
                horizontalLineTo(12.005f)
                lineTo(13.798f, 10.796f)
                lineTo(10.641f, 13.953f)
                lineTo(7.812f, 11.124f)
                lineTo(2.867f, 16.07f)
                curveTo(2.313f, 14.827f, 2.005f, 13.451f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                curveTo(8.671f, 22.003f, 5.718f, 20.372f, 3.901f, 17.864f)
                close()
            }
        }
        .build()
        return _fundsFill!!
    }

private var _fundsFill: ImageVector? = null
