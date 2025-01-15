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

public val FilledGroup.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = Builder(name = "Helicopter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(4.642f, 0.0f, 8.0f, 2.218f, 8.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.652f, 0.0f, -3.0f, -1.348f, -3.0f, -3.0f)
                verticalLineToRelative(-1.001f)
                lineToRelative(-6.0f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, -0.553f)
                lineToRelative(-1.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.788f, -0.894f)
                lineToRelative(0.724f, 1.447f)
                lineToRelative(5.382f, -0.001f)
                lineToRelative(0.005f, -0.175f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
                moveTo(16.001f, 10.174f)
                lineToRelative(-0.001f, 1.826f)
                horizontalLineToRelative(3.36f)
                curveToRelative(-0.665f, -0.906f, -1.825f, -1.539f, -3.359f, -1.826f)
            }
        }
        .build()
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
