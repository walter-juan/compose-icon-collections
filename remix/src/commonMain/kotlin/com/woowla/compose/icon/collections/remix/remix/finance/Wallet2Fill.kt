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

public val FinanceGroup.Wallet2Fill: ImageVector
    get() {
        if (_wallet2Fill != null) {
            return _wallet2Fill!!
        }
        _wallet2Fill = Builder(name = "Wallet2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.005f, 8.0f)
                horizontalLineTo(13.005f)
                curveTo(12.453f, 8.0f, 12.005f, 8.448f, 12.005f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(12.005f, 15.552f, 12.453f, 16.0f, 13.005f, 16.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.005f, 11.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _wallet2Fill!!
    }

private var _wallet2Fill: ImageVector? = null
