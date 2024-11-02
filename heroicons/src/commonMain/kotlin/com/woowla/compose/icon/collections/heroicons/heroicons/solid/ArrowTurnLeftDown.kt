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

public val SolidGroup.ArrowTurnLeftDown: ImageVector
    get() {
        if (_arrowTurnLeftDown != null) {
            return _arrowTurnLeftDown!!
        }
        _arrowTurnLeftDown = Builder(name = "ArrowTurnLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.24f, 3.75f)
                curveTo(20.24f, 4.164f, 19.904f, 4.5f, 19.49f, 4.5f)
                lineTo(8.989f, 4.5f)
                lineTo(8.989f, 18.439f)
                lineTo(11.459f, 15.969f)
                curveTo(11.752f, 15.676f, 12.227f, 15.676f, 12.519f, 15.969f)
                curveTo(12.812f, 16.262f, 12.812f, 16.737f, 12.519f, 17.03f)
                lineTo(8.769f, 20.78f)
                curveTo(8.476f, 21.073f, 8.001f, 21.073f, 7.708f, 20.78f)
                lineTo(3.958f, 17.03f)
                curveTo(3.665f, 16.737f, 3.665f, 16.262f, 3.958f, 15.969f)
                curveTo(4.251f, 15.676f, 4.726f, 15.676f, 5.019f, 15.969f)
                lineTo(7.489f, 18.439f)
                lineTo(7.489f, 3.75f)
                curveTo(7.489f, 3.336f, 7.825f, 3.0f, 8.239f, 3.0f)
                lineTo(19.49f, 3.0f)
                curveTo(19.904f, 3.0f, 20.24f, 3.336f, 20.24f, 3.75f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftDown!!
    }

private var _arrowTurnLeftDown: ImageVector? = null
