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

public val FinanceGroup.RedPacketFill: ImageVector
    get() {
        if (_redPacketFill != null) {
            return _redPacketFill!!
        }
        _redPacketFill = Builder(name = "RedPacketFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.005f, 5.94f)
                curveTo(19.266f, 7.911f, 16.889f, 9.306f, 14.199f, 9.803f)
                curveTo(13.774f, 9.028f, 12.951f, 8.503f, 12.005f, 8.503f)
                curveTo(11.059f, 8.503f, 10.236f, 9.028f, 9.811f, 9.803f)
                curveTo(7.12f, 9.306f, 4.744f, 7.911f, 3.005f, 5.94f)
                verticalLineTo(3.003f)
                curveTo(3.005f, 2.451f, 3.453f, 2.003f, 4.005f, 2.003f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 2.003f, 21.005f, 2.451f, 21.005f, 3.003f)
                verticalLineTo(5.94f)
                close()
                moveTo(21.005f, 8.727f)
                verticalLineTo(21.003f)
                curveTo(21.005f, 21.555f, 20.557f, 22.003f, 20.005f, 22.003f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.003f, 3.005f, 21.555f, 3.005f, 21.003f)
                verticalLineTo(8.727f)
                curveTo(4.865f, 10.29f, 7.138f, 11.377f, 9.636f, 11.803f)
                curveTo(9.969f, 12.791f, 10.904f, 13.503f, 12.005f, 13.503f)
                curveTo(13.106f, 13.503f, 14.04f, 12.791f, 14.374f, 11.803f)
                curveTo(16.872f, 11.377f, 19.145f, 10.29f, 21.005f, 8.727f)
                close()
            }
        }
        .build()
        return _redPacketFill!!
    }

private var _redPacketFill: ImageVector? = null
