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

public val FinanceGroup.VipCrown2Line: ImageVector
    get() {
        if (_vipCrown2Line != null) {
            return _vipCrown2Line!!
        }
        _vipCrown2Line = Builder(name = "VipCrown2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.497f, 8.065f)
                lineTo(4.784f, 19.0f)
                horizontalLineTo(19.227f)
                lineTo(20.513f, 8.065f)
                lineTo(16.503f, 10.738f)
                lineTo(12.005f, 4.441f)
                lineTo(7.507f, 10.738f)
                lineTo(3.497f, 8.065f)
                close()
                moveTo(2.806f, 5.2f)
                lineTo(7.005f, 8.0f)
                lineTo(11.191f, 2.139f)
                curveTo(11.512f, 1.689f, 12.137f, 1.585f, 12.586f, 1.906f)
                curveTo(12.676f, 1.97f, 12.755f, 2.049f, 12.819f, 2.139f)
                lineTo(17.005f, 8.0f)
                lineTo(21.204f, 5.2f)
                curveTo(21.664f, 4.894f, 22.285f, 5.018f, 22.591f, 5.477f)
                curveTo(22.723f, 5.675f, 22.78f, 5.913f, 22.752f, 6.149f)
                lineTo(21.109f, 20.117f)
                curveTo(21.05f, 20.62f, 20.623f, 21.0f, 20.116f, 21.0f)
                horizontalLineTo(3.894f)
                curveTo(3.387f, 21.0f, 2.96f, 20.62f, 2.901f, 20.117f)
                lineTo(1.258f, 6.149f)
                curveTo(1.193f, 5.6f, 1.586f, 5.104f, 2.134f, 5.039f)
                curveTo(2.37f, 5.011f, 2.608f, 5.068f, 2.806f, 5.2f)
                close()
                moveTo(12.005f, 15.0f)
                curveTo(10.901f, 15.0f, 10.005f, 14.104f, 10.005f, 13.0f)
                curveTo(10.005f, 11.895f, 10.901f, 11.0f, 12.005f, 11.0f)
                curveTo(13.11f, 11.0f, 14.005f, 11.895f, 14.005f, 13.0f)
                curveTo(14.005f, 14.104f, 13.11f, 15.0f, 12.005f, 15.0f)
                close()
            }
        }
        .build()
        return _vipCrown2Line!!
    }

private var _vipCrown2Line: ImageVector? = null
