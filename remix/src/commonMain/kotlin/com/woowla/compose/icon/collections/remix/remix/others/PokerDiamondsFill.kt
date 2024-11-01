package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PokerDiamondsFill: ImageVector
    get() {
        if (_pokerDiamondsFill != null) {
            return _pokerDiamondsFill!!
        }
        _pokerDiamondsFill = Builder(name = "PokerDiamondsFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.036f, 10.734f)
                lineTo(11.226f, 1.946f)
                curveTo(11.626f, 1.457f, 12.374f, 1.457f, 12.774f, 1.946f)
                lineTo(19.964f, 10.734f)
                curveTo(20.566f, 11.47f, 20.566f, 12.53f, 19.964f, 13.267f)
                lineTo(12.774f, 22.054f)
                curveTo(12.374f, 22.543f, 11.626f, 22.543f, 11.226f, 22.054f)
                lineTo(4.036f, 13.267f)
                curveTo(3.433f, 12.53f, 3.433f, 11.47f, 4.036f, 10.734f)
                close()
            }
        }
        .build()
        return _pokerDiamondsFill!!
    }

private var _pokerDiamondsFill: ImageVector? = null
