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

public val FinanceGroup.Coupon4Line: ImageVector
    get() {
        if (_coupon4Line != null) {
            return _coupon4Line!!
        }
        _coupon4Line = Builder(name = "Coupon4Line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.54f, 19.0f)
                curveTo(9.232f, 17.804f, 10.524f, 17.0f, 12.005f, 17.0f)
                curveTo(13.485f, 17.0f, 14.778f, 17.804f, 15.47f, 19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.47f)
                curveTo(14.778f, 6.195f, 13.485f, 7.0f, 12.005f, 7.0f)
                curveTo(10.524f, 7.0f, 9.232f, 6.195f, 8.54f, 5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.54f)
                close()
                moveTo(6.005f, 8.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.005f)
                verticalLineTo(8.0f)
                close()
                moveTo(16.005f, 8.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.005f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _coupon4Line!!
    }

private var _coupon4Line: ImageVector? = null
