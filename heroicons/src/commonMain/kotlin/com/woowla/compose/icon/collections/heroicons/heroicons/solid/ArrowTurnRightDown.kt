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

public val SolidGroup.ArrowTurnRightDown: ImageVector
    get() {
        if (_arrowTurnRightDown != null) {
            return _arrowTurnRightDown!!
        }
        _arrowTurnRightDown = Builder(name = "ArrowTurnRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.738f, 3.75f)
                curveTo(3.738f, 4.164f, 4.074f, 4.5f, 4.488f, 4.5f)
                lineTo(14.989f, 4.5f)
                lineTo(14.989f, 18.439f)
                lineTo(12.519f, 15.969f)
                curveTo(12.226f, 15.676f, 11.751f, 15.676f, 11.459f, 15.969f)
                curveTo(11.166f, 16.262f, 11.166f, 16.737f, 11.459f, 17.03f)
                lineTo(15.209f, 20.78f)
                curveTo(15.502f, 21.073f, 15.977f, 21.073f, 16.27f, 20.78f)
                lineTo(20.02f, 17.03f)
                curveTo(20.313f, 16.737f, 20.313f, 16.262f, 20.02f, 15.969f)
                curveTo(19.727f, 15.676f, 19.252f, 15.676f, 18.959f, 15.969f)
                lineTo(16.489f, 18.439f)
                lineTo(16.489f, 3.75f)
                curveTo(16.489f, 3.336f, 16.153f, 3.0f, 15.739f, 3.0f)
                lineTo(4.488f, 3.0f)
                curveTo(4.074f, 3.0f, 3.738f, 3.336f, 3.738f, 3.75f)
                close()
            }
        }
        .build()
        return _arrowTurnRightDown!!
    }

private var _arrowTurnRightDown: ImageVector? = null
