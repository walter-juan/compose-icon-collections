package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.002f)
                verticalLineToRelative(1.998f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineToRelative(12.0f, -0.004f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.533f, 2.888f)
                lineToRelative(0.06f, 0.137f)
                lineToRelative(0.136f, -0.009f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.99f, 3.477f)
                lineToRelative(0.063f, 0.213f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.696f, 5.831f)
                lineToRelative(-0.087f, 0.037f)
                verticalLineToRelative(1.428f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineToRelative(-12.0f, 0.004f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.433f)
                lineToRelative(-0.123f, -0.055f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.6f, -3.001f)
                lineToRelative(-0.064f, -0.223f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.193f, -6.27f)
                lineToRelative(0.066f, -0.142f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.302f, -2.877f)
                close()
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
