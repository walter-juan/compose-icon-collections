package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) {
            return _transitionTop!!
        }
        _transitionTop = Builder(name = "TransitionTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineToRelative(0.081f, 0.003f)
                lineToRelative(0.12f, 0.017f)
                lineToRelative(0.111f, 0.03f)
                lineToRelative(0.111f, 0.044f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.104f, 0.074f)
                lineToRelative(0.082f, 0.073f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.292f)
                verticalLineToRelative(4.585f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.112f, -0.097f)
                lineToRelative(0.11f, -0.071f)
                lineToRelative(0.062f, -0.031f)
                lineToRelative(0.081f, -0.034f)
                lineToRelative(0.076f, -0.024f)
                lineToRelative(0.118f, -0.025f)
                lineToRelative(0.058f, -0.007f)
                close()
                moveTo(18.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null