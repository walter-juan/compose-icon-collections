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

public val FinanceGroup.Coupon4Fill: ImageVector
    get() {
        if (_coupon4Fill != null) {
            return _coupon4Fill!!
        }
        _coupon4Fill = Builder(name = "Coupon4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(10.005f)
                curveTo(10.005f, 4.104f, 10.9f, 5.0f, 12.005f, 5.0f)
                curveTo(13.109f, 5.0f, 14.005f, 4.104f, 14.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(14.005f)
                curveTo(14.005f, 19.895f, 13.109f, 19.0f, 12.005f, 19.0f)
                curveTo(10.9f, 19.0f, 10.005f, 19.895f, 10.005f, 21.0f)
                close()
                moveTo(6.005f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.005f)
                close()
                moveTo(16.005f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.005f)
                close()
            }
        }
        .build()
        return _coupon4Fill!!
    }

private var _coupon4Fill: ImageVector? = null
