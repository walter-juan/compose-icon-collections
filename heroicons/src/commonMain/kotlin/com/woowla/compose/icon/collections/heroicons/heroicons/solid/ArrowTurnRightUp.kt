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

public val SolidGroup.ArrowTurnRightUp: ImageVector
    get() {
        if (_arrowTurnRightUp != null) {
            return _arrowTurnRightUp!!
        }
        _arrowTurnRightUp = Builder(name = "ArrowTurnRightUp", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.738f, 20.249f)
                curveTo(3.738f, 19.835f, 4.074f, 19.499f, 4.488f, 19.499f)
                lineTo(14.989f, 19.499f)
                lineTo(14.989f, 5.56f)
                lineTo(12.519f, 8.03f)
                curveTo(12.226f, 8.323f, 11.751f, 8.323f, 11.458f, 8.03f)
                curveTo(11.166f, 7.737f, 11.166f, 7.262f, 11.459f, 6.969f)
                lineTo(15.209f, 3.219f)
                curveTo(15.502f, 2.926f, 15.977f, 2.926f, 16.27f, 3.219f)
                lineTo(20.02f, 6.969f)
                curveTo(20.313f, 7.262f, 20.313f, 7.737f, 20.02f, 8.03f)
                curveTo(19.727f, 8.323f, 19.252f, 8.323f, 18.959f, 8.03f)
                lineTo(16.489f, 5.56f)
                lineTo(16.489f, 20.249f)
                curveTo(16.489f, 20.663f, 16.153f, 20.999f, 15.739f, 20.999f)
                lineTo(4.488f, 20.999f)
                curveTo(4.074f, 20.999f, 3.738f, 20.663f, 3.738f, 20.249f)
                close()
            }
        }
        .build()
        return _arrowTurnRightUp!!
    }

private var _arrowTurnRightUp: ImageVector? = null
