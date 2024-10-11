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

public val FinanceGroup.EthLine: ImageVector
    get() {
        if (_ethLine != null) {
            return _ethLine!!
        }
        _ethLine = Builder(name = "EthLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.149f, 15.304f)
                lineTo(12.0f, 20.6f)
                lineTo(15.851f, 15.304f)
                lineTo(12.0f, 17.674f)
                lineTo(8.149f, 15.304f)
                close()
                moveTo(17.137f, 12.164f)
                lineTo(12.0f, 3.816f)
                lineTo(6.863f, 12.164f)
                lineTo(12.0f, 15.326f)
                lineTo(17.137f, 12.164f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(12.0f, 0.0f)
                lineTo(20.0f, 13.0f)
                lineTo(12.0f, 24.0f)
                lineTo(4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _ethLine!!
    }

private var _ethLine: ImageVector? = null
