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

public val FilledGroup.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) {
            return _aerialLift!!
        }
        _aerialLift = Builder(name = "AerialLift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.876f, 2.008f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.248f, 1.984f)
                lineToRelative(-7.124f, 0.891f)
                verticalLineToRelative(2.117f)
                horizontalLineToRelative(4.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.688f, 0.274f)
                lineToRelative(0.087f, 0.093f)
                curveToRelative(2.79f, 3.417f, 2.717f, 9.963f, -0.226f, 13.295f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.749f, 0.338f)
                horizontalLineToRelative(-10.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.763f, -0.353f)
                curveToRelative(-2.86f, -3.373f, -2.86f, -9.92f, 0.0f, -13.294f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.763f, -0.353f)
                horizontalLineToRelative(4.106f)
                verticalLineToRelative(-1.867f)
                lineToRelative(-6.876f, 0.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.095f, -0.754f)
                lineToRelative(-0.021f, -0.115f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.868f, -1.116f)
                lineToRelative(7.996f, -1.0f)
                lineToRelative(0.011f, -0.001f)
                lineToRelative(0.008f, -0.001f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(-3.617f)
                lineToRelative(-0.051f, 0.072f)
                curveToRelative(-0.718f, 1.042f, -1.149f, 2.41f, -1.292f, 3.844f)
                lineToRelative(-0.008f, 0.084f)
                horizontalLineToRelative(4.968f)
                close()
                moveTo(16.698f, 9.0f)
                horizontalLineToRelative(-3.698f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.979f)
                lineToRelative(-0.005f, -0.072f)
                curveToRelative(-0.123f, -1.436f, -0.533f, -2.811f, -1.232f, -3.864f)
                close()
            }
        }
        .build()
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null
