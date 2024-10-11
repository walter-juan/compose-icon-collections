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

public val FinanceGroup.Ticket2Line: ImageVector
    get() {
        if (_ticket2Line != null) {
            return _ticket2Line!!
        }
        _ticket2Line = Builder(name = "Ticket2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.005f, 3.0f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(9.5f)
                curveTo(20.624f, 9.5f, 19.505f, 10.619f, 19.505f, 12.0f)
                curveTo(19.505f, 13.38f, 20.624f, 14.5f, 22.005f, 14.5f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(14.5f)
                curveTo(3.386f, 14.5f, 4.505f, 13.38f, 4.505f, 12.0f)
                curveTo(4.505f, 10.619f, 3.386f, 9.5f, 2.005f, 9.5f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                close()
                moveTo(20.005f, 5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(7.968f)
                lineTo(4.161f, 8.049f)
                curveTo(5.499f, 8.781f, 6.425f, 10.173f, 6.5f, 11.788f)
                lineTo(6.505f, 12.0f)
                curveTo(6.505f, 13.704f, 5.558f, 15.187f, 4.161f, 15.951f)
                lineTo(4.005f, 16.031f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(16.031f)
                lineTo(19.849f, 15.951f)
                curveTo(18.51f, 15.219f, 17.585f, 13.826f, 17.51f, 12.212f)
                lineTo(17.505f, 12.0f)
                curveTo(17.505f, 10.296f, 18.452f, 8.813f, 19.849f, 8.049f)
                lineTo(20.005f, 7.968f)
                verticalLineTo(5.0f)
                close()
                moveTo(16.005f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.005f)
                close()
            }
        }
        .build()
        return _ticket2Line!!
    }

private var _ticket2Line: ImageVector? = null
