package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.MarkdownFill: ImageVector
    get() {
        if (_markdownFill != null) {
            return _markdownFill!!
        }
        _markdownFill = Builder(name = "MarkdownFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(11.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.793f)
                lineTo(9.854f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(12.0f, 9.293f)
                lineTo(12.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                moveTo(3.56f, 7.01f)
                horizontalLineToRelative(0.056f)
                lineToRelative(1.428f, 3.239f)
                horizontalLineToRelative(0.774f)
                lineToRelative(1.42f, -3.24f)
                horizontalLineToRelative(0.056f)
                lineTo(7.294f, 11.0f)
                horizontalLineToRelative(1.073f)
                lineTo(8.367f, 5.001f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.71f, 3.894f)
                horizontalLineToRelative(-0.039f)
                lineToRelative(-1.71f, -3.894f)
                lineTo(2.5f, 5.001f)
                lineTo(2.5f, 11.0f)
                horizontalLineToRelative(1.06f)
                close()
            }
        }
        .build()
        return _markdownFill!!
    }

private var _markdownFill: ImageVector? = null
