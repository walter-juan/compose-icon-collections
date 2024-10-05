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

public val FilledGroup.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 1.732f)
                verticalLineToRelative(-3.475f)
                curveToRelative(0.0f, -1.242f, 0.995f, -2.257f, 2.233f, -2.257f)
                curveToRelative(0.372f, 0.0f, 0.738f, 0.094f, 1.122f, 0.307f)
                lineToRelative(0.18f, 0.117f)
                curveToRelative(1.695f, 1.23f, 2.76f, 3.035f, 3.773f, 6.34f)
                quadToRelative(0.674f, 2.204f, 0.692f, 5.06f)
                curveToRelative(0.016f, 2.195f, -1.657f, 4.024f, -3.843f, 4.168f)
                lineToRelative(-0.237f, 0.008f)
                curveToRelative(-2.17f, 0.0f, -3.92f, -1.787f, -3.92f, -3.98f)
                verticalLineToRelative(-4.146f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.893f, -1.112f)
                lineToRelative(-0.107f, -0.118f)
                lineToRelative(-0.107f, 0.118f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.892f, 1.112f)
                lineToRelative(-0.001f, 4.146f)
                curveToRelative(0.0f, 2.193f, -1.75f, 3.98f, -3.919f, 3.98f)
                lineToRelative(-0.268f, -0.01f)
                curveToRelative(-2.155f, -0.142f, -3.827f, -1.971f, -3.811f, -4.165f)
                quadToRelative(0.018f, -2.858f, 0.692f, -5.06f)
                curveToRelative(1.011f, -3.307f, 2.076f, -5.112f, 3.822f, -6.375f)
                lineToRelative(0.188f, -0.117f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.064f, -0.273f)
                curveToRelative(1.237f, 0.0f, 2.232f, 1.015f, 2.232f, 2.257f)
                lineToRelative(0.001f, 3.475f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.999f, -1.732f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
