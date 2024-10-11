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

public val FinanceGroup.Wallet3Fill: ImageVector
    get() {
        if (_wallet3Fill != null) {
            return _wallet3Fill!!
        }
        _wallet3Fill = Builder(name = "Wallet3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.005f, 6.0f)
                horizontalLineTo(15.005f)
                curveTo(11.691f, 6.0f, 9.005f, 8.686f, 9.005f, 12.0f)
                curveTo(9.005f, 15.314f, 11.691f, 18.0f, 15.005f, 18.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.005f, 8.0f)
                horizontalLineTo(23.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.005f)
                curveTo(12.796f, 16.0f, 11.005f, 14.209f, 11.005f, 12.0f)
                curveTo(11.005f, 9.791f, 12.796f, 8.0f, 15.005f, 8.0f)
                close()
                moveTo(15.005f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.005f)
                close()
            }
        }
        .build()
        return _wallet3Fill!!
    }

private var _wallet3Fill: ImageVector? = null
