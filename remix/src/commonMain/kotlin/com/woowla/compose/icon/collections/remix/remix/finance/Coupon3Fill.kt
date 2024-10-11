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

public val FinanceGroup.Coupon3Fill: ImageVector
    get() {
        if (_coupon3Fill != null) {
            return _coupon3Fill!!
        }
        _coupon3Fill = Builder(name = "Coupon3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.005f, 21.0f)
                curveTo(11.005f, 20.171f, 10.333f, 19.5f, 9.505f, 19.5f)
                curveTo(8.676f, 19.5f, 8.005f, 20.171f, 8.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(8.005f)
                curveTo(8.005f, 3.828f, 8.676f, 4.5f, 9.505f, 4.5f)
                curveTo(10.333f, 4.5f, 11.005f, 3.828f, 11.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(9.5f)
                curveTo(20.624f, 9.5f, 19.505f, 10.619f, 19.505f, 12.0f)
                curveTo(19.505f, 13.38f, 20.624f, 14.5f, 22.005f, 14.5f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(11.005f)
                close()
                moveTo(9.505f, 10.5f)
                curveTo(10.333f, 10.5f, 11.005f, 9.828f, 11.005f, 9.0f)
                curveTo(11.005f, 8.171f, 10.333f, 7.5f, 9.505f, 7.5f)
                curveTo(8.676f, 7.5f, 8.005f, 8.171f, 8.005f, 9.0f)
                curveTo(8.005f, 9.828f, 8.676f, 10.5f, 9.505f, 10.5f)
                close()
                moveTo(9.505f, 16.5f)
                curveTo(10.333f, 16.5f, 11.005f, 15.828f, 11.005f, 15.0f)
                curveTo(11.005f, 14.171f, 10.333f, 13.5f, 9.505f, 13.5f)
                curveTo(8.676f, 13.5f, 8.005f, 14.171f, 8.005f, 15.0f)
                curveTo(8.005f, 15.828f, 8.676f, 16.5f, 9.505f, 16.5f)
                close()
            }
        }
        .build()
        return _coupon3Fill!!
    }

private var _coupon3Fill: ImageVector? = null
