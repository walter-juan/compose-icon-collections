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

public val FinanceGroup.CouponLine: ImageVector
    get() {
        if (_couponLine != null) {
            return _couponLine!!
        }
        _couponLine = Builder(name = "CouponLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.005f, 9.5f)
                verticalLineTo(4.0f)
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
                verticalLineTo(14.5f)
                curveTo(3.386f, 14.5f, 4.505f, 13.38f, 4.505f, 12.0f)
                curveTo(4.505f, 10.619f, 3.386f, 9.5f, 2.005f, 9.5f)
                close()
                moveTo(4.005f, 7.968f)
                curveTo(5.487f, 8.704f, 6.505f, 10.233f, 6.505f, 12.0f)
                curveTo(6.505f, 13.767f, 5.487f, 15.296f, 4.005f, 16.032f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(16.032f)
                curveTo(18.523f, 15.296f, 17.505f, 13.767f, 17.505f, 12.0f)
                curveTo(17.505f, 10.233f, 18.523f, 8.704f, 20.005f, 7.968f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(7.968f)
                close()
                moveTo(9.005f, 9.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(9.0f)
                close()
                moveTo(9.005f, 13.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _couponLine!!
    }

private var _couponLine: ImageVector? = null
