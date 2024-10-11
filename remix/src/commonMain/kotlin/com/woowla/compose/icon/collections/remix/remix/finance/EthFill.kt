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

public val FinanceGroup.EthFill: ImageVector
    get() {
        if (_ethFill != null) {
            return _ethFill!!
        }
        _ethFill = Builder(name = "EthFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(4.63f, 12.22f)
                lineTo(12.0f, 16.574f)
                lineTo(19.37f, 12.22f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(12.0f, 24.0f)
                lineTo(4.63f, 13.617f)
                lineTo(12.0f, 18.0f)
                lineTo(19.37f, 13.617f)
                lineTo(12.0f, 24.0f)
                close()
            }
        }
        .build()
        return _ethFill!!
    }

private var _ethFill: ImageVector? = null
