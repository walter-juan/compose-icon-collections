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

public val FinanceGroup.VipLine: ImageVector
    get() {
        if (_vipLine != null) {
            return _vipLine!!
        }
        _vipLine = Builder(name = "VipLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.005f, 19.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.005f, 8.0f)
                horizontalLineTo(13.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(8.0f)
                close()
                moveTo(7.97f, 8.0f)
                lineTo(6.109f, 13.113f)
                lineTo(4.248f, 8.0f)
                horizontalLineTo(2.123f)
                lineTo(5.109f, 15.964f)
                horizontalLineTo(7.109f)
                lineTo(10.095f, 8.0f)
                horizontalLineTo(7.97f)
                close()
                moveTo(17.005f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.005f)
                curveTo(20.662f, 8.0f, 22.005f, 9.343f, 22.005f, 11.0f)
                curveTo(22.005f, 12.657f, 20.662f, 14.0f, 19.005f, 14.0f)
                horizontalLineTo(17.005f)
                close()
                moveTo(17.005f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.005f)
                curveTo(19.557f, 12.0f, 20.005f, 11.552f, 20.005f, 11.0f)
                curveTo(20.005f, 10.448f, 19.557f, 10.0f, 19.005f, 10.0f)
                horizontalLineTo(17.005f)
                close()
                moveTo(2.005f, 3.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _vipLine!!
    }

private var _vipLine: ImageVector? = null
