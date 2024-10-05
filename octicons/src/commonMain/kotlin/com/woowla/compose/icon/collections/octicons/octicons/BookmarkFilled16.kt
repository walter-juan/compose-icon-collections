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

public val Octicons.BookmarkFilled16: ImageVector
    get() {
        if (_bookmarkFilled16 != null) {
            return _bookmarkFilled16!!
        }
        _bookmarkFilled16 = Builder(name = "BookmarkFilled16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.75f)
                curveTo(3.0f, 1.784f, 3.784f, 1.0f, 4.75f, 1.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.227f, 0.579f)
                lineTo(8.0f, 11.722f)
                lineToRelative(-3.773f, 3.107f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 14.25f)
                verticalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _bookmarkFilled16!!
    }

private var _bookmarkFilled16: ImageVector? = null
