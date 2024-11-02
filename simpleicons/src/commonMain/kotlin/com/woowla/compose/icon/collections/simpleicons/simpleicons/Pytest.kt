package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Pytest: ImageVector
    get() {
        if (_pytest != null) {
            return _pytest!!
        }
        _pytest = Builder(name = "Pytest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.615f, 0.0f)
                verticalLineToRelative(0.887f)
                horizontalLineToRelative(3.84f)
                lineTo(6.455f, 0.0f)
                close()
                moveTo(7.637f, 0.0f)
                verticalLineToRelative(0.887f)
                horizontalLineToRelative(3.842f)
                lineTo(11.479f, 0.0f)
                close()
                moveTo(12.594f, 0.0f)
                verticalLineToRelative(0.887f)
                horizontalLineToRelative(3.842f)
                lineTo(16.436f, 0.0f)
                close()
                moveTo(17.529f, 0.0f)
                verticalLineToRelative(0.887f)
                horizontalLineToRelative(3.842f)
                lineTo(21.371f, 0.0f)
                close()
                moveTo(2.447f, 1.895f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.936f, 0.936f)
                curveToRelative(0.0f, 0.517f, 0.419f, 0.938f, 0.936f, 0.938f)
                horizontalLineToRelative(19.105f)
                curveToRelative(0.517f, 0.0f, 0.936f, -0.42f, 0.936f, -0.938f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.936f, -0.936f)
                close()
                moveTo(2.615f, 4.742f)
                lineTo(2.615f, 24.0f)
                lineTo(6.455f, 24.0f)
                lineTo(6.455f, 4.742f)
                close()
                moveTo(7.637f, 4.742f)
                lineTo(7.637f, 20.543f)
                horizontalLineToRelative(3.842f)
                lineTo(11.478f, 4.742f)
                close()
                moveTo(12.594f, 4.742f)
                lineTo(12.594f, 15.291f)
                horizontalLineToRelative(3.85f)
                lineTo(16.443f, 4.742f)
                close()
                moveTo(17.529f, 4.742f)
                verticalLineToRelative(6.494f)
                horizontalLineToRelative(3.842f)
                lineTo(21.371f, 4.742f)
                close()
            }
        }
        .build()
        return _pytest!!
    }

private var _pytest: ImageVector? = null
