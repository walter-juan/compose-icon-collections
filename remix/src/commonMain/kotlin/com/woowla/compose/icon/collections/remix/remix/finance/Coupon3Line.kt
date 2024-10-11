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

public val FinanceGroup.Coupon3Line: ImageVector
    get() {
        if (_coupon3Line != null) {
            return _coupon3Line!!
        }
        _coupon3Line = Builder(name = "Coupon3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.005f, 4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(9.5f)
                curveTo(20.624f, 9.5f, 19.505f, 10.619f, 19.505f, 12.0f)
                curveTo(19.505f, 13.38f, 20.624f, 14.5f, 22.005f, 14.5f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.09f, 19.0f)
                curveTo(8.296f, 18.417f, 8.852f, 18.0f, 9.505f, 18.0f)
                curveTo(10.158f, 18.0f, 10.714f, 18.417f, 10.92f, 19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(16.032f)
                curveTo(18.523f, 15.296f, 17.505f, 13.767f, 17.505f, 12.0f)
                curveTo(17.505f, 10.233f, 18.523f, 8.704f, 20.005f, 7.968f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.92f)
                curveTo(10.714f, 5.582f, 10.158f, 6.0f, 9.505f, 6.0f)
                curveTo(8.852f, 6.0f, 8.296f, 5.582f, 8.09f, 5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.09f)
                close()
                moveTo(9.505f, 11.0f)
                curveTo(8.676f, 11.0f, 8.005f, 10.328f, 8.005f, 9.5f)
                curveTo(8.005f, 8.671f, 8.676f, 8.0f, 9.505f, 8.0f)
                curveTo(10.333f, 8.0f, 11.005f, 8.671f, 11.005f, 9.5f)
                curveTo(11.005f, 10.328f, 10.333f, 11.0f, 9.505f, 11.0f)
                close()
                moveTo(9.505f, 16.0f)
                curveTo(8.676f, 16.0f, 8.005f, 15.328f, 8.005f, 14.5f)
                curveTo(8.005f, 13.671f, 8.676f, 13.0f, 9.505f, 13.0f)
                curveTo(10.333f, 13.0f, 11.005f, 13.671f, 11.005f, 14.5f)
                curveTo(11.005f, 15.328f, 10.333f, 16.0f, 9.505f, 16.0f)
                close()
            }
        }
        .build()
        return _coupon3Line!!
    }

private var _coupon3Line: ImageVector? = null
