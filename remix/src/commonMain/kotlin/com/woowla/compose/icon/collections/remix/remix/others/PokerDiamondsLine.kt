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

public val OthersGroup.PokerDiamondsLine: ImageVector
    get() {
        if (_pokerDiamondsLine != null) {
            return _pokerDiamondsLine!!
        }
        _pokerDiamondsLine = Builder(name = "PokerDiamondsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.036f, 10.733f)
                curveTo(3.433f, 11.47f, 3.433f, 12.53f, 4.036f, 13.266f)
                lineTo(11.226f, 22.054f)
                curveTo(11.626f, 22.543f, 12.374f, 22.543f, 12.774f, 22.054f)
                lineTo(19.964f, 13.266f)
                curveTo(20.566f, 12.53f, 20.566f, 11.47f, 19.964f, 10.733f)
                lineTo(12.774f, 1.946f)
                curveTo(12.374f, 1.457f, 11.626f, 1.457f, 11.226f, 1.946f)
                lineTo(4.036f, 10.733f)
                close()
                moveTo(12.0f, 4.158f)
                lineTo(18.416f, 12.0f)
                lineTo(12.0f, 19.841f)
                lineTo(5.584f, 12.0f)
                lineTo(12.0f, 4.158f)
                close()
            }
        }
        .build()
        return _pokerDiamondsLine!!
    }

private var _pokerDiamondsLine: ImageVector? = null
