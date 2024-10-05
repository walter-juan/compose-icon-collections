package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.DiffIgnored24: ImageVector
    get() {
        if (_diffIgnored24 != null) {
            return _diffIgnored24!!
        }
        _diffIgnored24 = Builder(name = "DiffIgnored24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 2.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.0f, 3.75f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 22.0f, 20.25f)
                lineTo(22.0f, 3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 20.25f, 2.0f)
                lineTo(3.75f, 2.0f)
                close()
                moveTo(3.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(3.75f, 20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(3.5f, 3.75f)
                close()
                moveTo(8.237f, 14.983f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.061f, 1.06f)
                lineToRelative(7.027f, -7.026f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-7.028f, 7.026f)
                close()
            }
        }
        .build()
        return _diffIgnored24!!
    }

private var _diffIgnored24: ImageVector? = null
