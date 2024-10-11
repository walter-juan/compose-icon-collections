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

public val FinanceGroup.VipDiamondFill: ImageVector
    get() {
        if (_vipDiamondFill != null) {
            return _vipDiamondFill!!
        }
        _vipDiamondFill = Builder(name = "VipDiamondFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.878f, 3.003f)
                horizontalLineTo(19.132f)
                curveTo(19.452f, 3.003f, 19.752f, 3.156f, 19.941f, 3.415f)
                lineTo(23.763f, 8.671f)
                curveTo(23.904f, 8.864f, 23.888f, 9.129f, 23.726f, 9.304f)
                lineTo(12.372f, 21.605f)
                curveTo(12.185f, 21.808f, 11.868f, 21.82f, 11.666f, 21.633f)
                curveTo(11.656f, 21.624f, 11.646f, 21.615f, 11.637f, 21.605f)
                lineTo(0.283f, 9.304f)
                curveTo(0.121f, 9.129f, 0.106f, 8.864f, 0.246f, 8.671f)
                lineTo(4.069f, 3.415f)
                curveTo(4.257f, 3.156f, 4.558f, 3.003f, 4.878f, 3.003f)
                close()
            }
        }
        .build()
        return _vipDiamondFill!!
    }

private var _vipDiamondFill: ImageVector? = null
