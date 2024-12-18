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

public val FinanceGroup.JewelryFill: ImageVector
    get() {
        if (_jewelryFill != null) {
            return _jewelryFill!!
        }
        _jewelryFill = Builder(name = "JewelryFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.847f)
                verticalLineTo(4.863f)
                curveTo(15.0f, 5.252f, 15.226f, 5.605f, 15.578f, 5.769f)
                lineTo(15.986f, 5.96f)
                curveTo(15.901f, 7.363f, 15.429f, 8.596f, 14.743f, 9.486f)
                curveTo(13.985f, 10.472f, 13.007f, 11.0f, 12.0f, 11.0f)
                curveTo(10.994f, 11.0f, 10.016f, 10.472f, 9.258f, 9.486f)
                curveTo(8.572f, 8.596f, 8.1f, 7.363f, 8.014f, 5.96f)
                lineTo(8.423f, 5.769f)
                curveTo(8.775f, 5.605f, 9.0f, 5.252f, 9.0f, 4.863f)
                verticalLineTo(2.847f)
                curveTo(9.0f, 2.358f, 9.354f, 1.942f, 9.84f, 1.886f)
                curveTo(11.282f, 1.72f, 12.719f, 1.72f, 14.161f, 1.886f)
                curveTo(14.647f, 1.942f, 15.0f, 2.358f, 15.0f, 2.847f)
                close()
                moveTo(6.097f, 6.855f)
                lineTo(2.85f, 8.37f)
                curveTo(2.103f, 8.719f, 1.778f, 9.605f, 2.121f, 10.354f)
                lineTo(6.599f, 20.125f)
                curveTo(6.844f, 20.658f, 7.376f, 21.0f, 7.963f, 21.0f)
                horizontalLineTo(16.038f)
                curveTo(16.624f, 21.0f, 17.157f, 20.658f, 17.402f, 20.125f)
                lineTo(21.88f, 10.354f)
                curveTo(22.223f, 9.605f, 21.897f, 8.719f, 21.15f, 8.37f)
                lineTo(17.903f, 6.855f)
                curveTo(17.691f, 8.323f, 17.136f, 9.656f, 16.329f, 10.706f)
                curveTo(15.416f, 11.893f, 14.148f, 12.748f, 12.681f, 12.953f)
                lineTo(14.189f, 15.064f)
                curveTo(14.375f, 15.325f, 14.375f, 15.675f, 14.189f, 15.936f)
                lineTo(12.204f, 18.715f)
                curveTo(12.104f, 18.855f, 11.897f, 18.855f, 11.797f, 18.715f)
                lineTo(9.812f, 15.936f)
                curveTo(9.626f, 15.675f, 9.626f, 15.325f, 9.812f, 15.064f)
                lineTo(11.32f, 12.953f)
                curveTo(9.853f, 12.748f, 8.585f, 11.893f, 7.672f, 10.706f)
                curveTo(6.864f, 9.656f, 6.31f, 8.323f, 6.097f, 6.855f)
                close()
            }
        }
        .build()
        return _jewelryFill!!
    }

private var _jewelryFill: ImageVector? = null
