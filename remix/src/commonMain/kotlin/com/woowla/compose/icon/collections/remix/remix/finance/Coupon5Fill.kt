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

public val FinanceGroup.Coupon5Fill: ImageVector
    get() {
        if (_coupon5Fill != null) {
            return _coupon5Fill!!
        }
        _coupon5Fill = Builder(name = "Coupon5Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.005f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.005f)
                close()
                moveTo(9.005f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.005f)
                close()
            }
        }
        .build()
        return _coupon5Fill!!
    }

private var _coupon5Fill: ImageVector? = null
