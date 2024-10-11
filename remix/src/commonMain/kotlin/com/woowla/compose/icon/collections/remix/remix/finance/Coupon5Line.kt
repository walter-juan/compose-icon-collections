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

public val FinanceGroup.Coupon5Line: ImageVector
    get() {
        if (_coupon5Line != null) {
            return _coupon5Line!!
        }
        _coupon5Line = Builder(name = "Coupon5Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.005f, 14.0f)
                verticalLineTo(21.0f)
                curveTo(21.005f, 21.552f, 20.557f, 22.0f, 20.005f, 22.0f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.0f, 3.005f, 21.552f, 3.005f, 21.0f)
                verticalLineTo(14.0f)
                curveTo(4.109f, 14.0f, 5.005f, 13.104f, 5.005f, 12.0f)
                curveTo(5.005f, 10.895f, 4.109f, 10.0f, 3.005f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(3.005f, 2.447f, 3.453f, 2.0f, 4.005f, 2.0f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 2.0f, 21.005f, 2.447f, 21.005f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(19.9f, 10.0f, 19.005f, 10.895f, 19.005f, 12.0f)
                curveTo(19.005f, 13.104f, 19.9f, 14.0f, 21.005f, 14.0f)
                close()
                moveTo(19.005f, 15.465f)
                curveTo(17.809f, 14.773f, 17.005f, 13.48f, 17.005f, 12.0f)
                curveTo(17.005f, 10.519f, 17.809f, 9.227f, 19.005f, 8.535f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.005f)
                verticalLineTo(8.535f)
                curveTo(6.2f, 9.227f, 7.005f, 10.519f, 7.005f, 12.0f)
                curveTo(7.005f, 13.48f, 6.2f, 14.773f, 5.005f, 15.465f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.005f)
                verticalLineTo(15.465f)
                close()
                moveTo(9.005f, 6.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.005f, 16.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _coupon5Line!!
    }

private var _coupon5Line: ImageVector? = null
