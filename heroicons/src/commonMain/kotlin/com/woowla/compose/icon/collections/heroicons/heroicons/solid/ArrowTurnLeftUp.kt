package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.24f, 20.249f)
                curveTo(20.24f, 19.835f, 19.904f, 19.499f, 19.49f, 19.499f)
                lineTo(8.989f, 19.499f)
                lineTo(8.989f, 5.56f)
                lineTo(11.459f, 8.03f)
                curveTo(11.752f, 8.323f, 12.227f, 8.323f, 12.519f, 8.03f)
                curveTo(12.812f, 7.737f, 12.812f, 7.262f, 12.519f, 6.969f)
                lineTo(8.769f, 3.219f)
                curveTo(8.476f, 2.926f, 8.001f, 2.926f, 7.708f, 3.219f)
                lineTo(3.958f, 6.969f)
                curveTo(3.665f, 7.262f, 3.665f, 7.737f, 3.958f, 8.03f)
                curveTo(4.251f, 8.323f, 4.726f, 8.323f, 5.019f, 8.03f)
                lineTo(7.489f, 5.56f)
                lineTo(7.489f, 20.249f)
                curveTo(7.489f, 20.663f, 7.825f, 20.999f, 8.239f, 20.999f)
                lineTo(19.49f, 20.999f)
                curveTo(19.904f, 20.999f, 20.24f, 20.663f, 20.24f, 20.249f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
