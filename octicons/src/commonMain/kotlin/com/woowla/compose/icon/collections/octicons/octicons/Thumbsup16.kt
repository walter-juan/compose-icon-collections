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

public val Octicons.Thumbsup16: ImageVector
    get() {
        if (_thumbsup16 != null) {
            return _thumbsup16!!
        }
        _thumbsup16 = Builder(name = "Thumbsup16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.347f, 0.631f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.123f, 0.26f)
                lineToRelative(0.238f, 0.04f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.591f, 4.098f)
                lineTo(11.494f, 6.0f)
                horizontalLineToRelative(0.665f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.118f, 4.167f)
                lineToRelative(-1.135f, 3.859f)
                arcTo(2.751f, 2.751f, 0.0f, false, true, 11.503f, 16.0f)
                horizontalLineTo(6.586f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -2.184f, -0.702f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 16.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                verticalLineToRelative(-6.5f)
                curveTo(0.0f, 6.784f, 0.784f, 6.0f, 1.75f, 6.0f)
                horizontalLineToRelative(3.417f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.217f, -0.127f)
                close()
                moveTo(4.75f, 13.649f)
                lineToRelative(0.396f, 0.33f)
                curveToRelative(0.404f, 0.337f, 0.914f, 0.521f, 1.44f, 0.521f)
                horizontalLineToRelative(4.917f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.2f, -0.897f)
                lineToRelative(1.135f, -3.859f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.159f, 7.5f)
                horizontalLineTo(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.721f, -0.956f)
                lineToRelative(0.731f, -2.558f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.127f, -2.14f)
                lineTo(6.69f, 6.611f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.523f, 0.889f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.25f, 7.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineTo(3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _thumbsup16!!
    }

private var _thumbsup16: ImageVector? = null
