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

public val FinanceGroup.Wallet3Line: ImageVector
    get() {
        if (_wallet3Line != null) {
            return _wallet3Line!!
        }
        _wallet3Line = Builder(name = "Wallet3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.005f, 7.0f)
                horizontalLineTo(23.005f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(20.005f, 17.0f)
                horizontalLineTo(14.005f)
                curveTo(11.243f, 17.0f, 9.005f, 14.761f, 9.005f, 12.0f)
                curveTo(9.005f, 9.238f, 11.243f, 7.0f, 14.005f, 7.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(17.0f)
                close()
                moveTo(21.005f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.005f)
                curveTo(12.348f, 9.0f, 11.005f, 10.343f, 11.005f, 12.0f)
                curveTo(11.005f, 13.657f, 12.348f, 15.0f, 14.005f, 15.0f)
                horizontalLineTo(21.005f)
                close()
                moveTo(14.005f, 11.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.005f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _wallet3Line!!
    }

private var _wallet3Line: ImageVector? = null
