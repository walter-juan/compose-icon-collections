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

public val FinanceGroup.VipFill: ImageVector
    get() {
        if (_vipFill != null) {
            return _vipFill!!
        }
        _vipFill = Builder(name = "VipFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.448f, 22.005f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.448f, 2.453f, 3.0f, 3.005f, 3.0f)
                close()
                moveTo(11.005f, 8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(13.005f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.005f)
                close()
                moveTo(10.72f, 8.5f)
                horizontalLineTo(8.606f)
                lineTo(7.109f, 12.613f)
                lineTo(5.612f, 8.5f)
                horizontalLineTo(3.498f)
                lineTo(6.109f, 15.464f)
                horizontalLineTo(8.109f)
                lineTo(10.72f, 8.5f)
                close()
                moveTo(16.005f, 13.5f)
                horizontalLineTo(17.505f)
                curveTo(18.886f, 13.5f, 20.005f, 12.381f, 20.005f, 11.0f)
                curveTo(20.005f, 9.619f, 18.886f, 8.5f, 17.505f, 8.5f)
                horizontalLineTo(14.005f)
                verticalLineTo(15.5f)
                horizontalLineTo(16.005f)
                verticalLineTo(13.5f)
                close()
                moveTo(16.005f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(17.505f)
                curveTo(17.781f, 10.5f, 18.005f, 10.724f, 18.005f, 11.0f)
                curveTo(18.005f, 11.276f, 17.781f, 11.5f, 17.505f, 11.5f)
                horizontalLineTo(16.005f)
                close()
            }
        }
        .build()
        return _vipFill!!
    }

private var _vipFill: ImageVector? = null
