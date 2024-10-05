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

public val Octicons.Ellipsis24: ImageVector
    get() {
        if (_ellipsis24 != null) {
            return _ellipsis24!!
        }
        _ellipsis24 = Builder(name = "Ellipsis24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.75f)
                verticalLineToRelative(5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 17.0f)
                lineTo(3.75f, 17.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 15.25f)
                verticalLineToRelative(-5.5f)
                curveTo(2.0f, 8.784f, 2.784f, 8.0f, 3.75f, 8.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                close()
                moveTo(13.25f, 12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(6.75f, 13.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(17.25f, 13.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
        }
        .build()
        return _ellipsis24!!
    }

private var _ellipsis24: ImageVector? = null
