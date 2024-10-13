package com.woowla.compose.icon.collections.devicons.devicons.replit

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ReplitGroup

public val ReplitGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF26207)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                curveToRelative(0.0f, -2.12f, 0.85f, -4.16f, 2.35f, -5.66f)
                arcTo(8.04f, 8.04f, 0.0f, false, true, 19.03f, 0.0f)
                horizontalLineToRelative(37.45f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 5.68f, 2.34f)
                arcTo(7.99f, 7.99f, 0.0f, false, true, 64.5f, 8.0f)
                verticalLineToRelative(34.67f)
                lineTo(19.02f, 42.67f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, -5.67f, -2.34f)
                arcTo(7.99f, 7.99f, 0.0f, false, true, 11.0f, 34.67f)
                lineTo(11.0f, 8.0f)
                close()
                moveTo(64.5f, 42.67f)
                horizontalLineToRelative(45.47f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 5.68f, 2.34f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, 2.35f, 5.66f)
                verticalLineToRelative(26.67f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -2.35f, 5.66f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, -5.68f, 2.34f)
                lineTo(64.5f, 85.33f)
                lineTo(64.5f, 42.67f)
                close()
                moveTo(11.0f, 93.33f)
                curveToRelative(0.0f, -2.12f, 0.85f, -4.16f, 2.35f, -5.66f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 5.68f, -2.34f)
                lineTo(64.5f, 85.33f)
                lineTo(64.5f, 120.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -2.35f, 5.66f)
                arcTo(8.04f, 8.04f, 0.0f, false, true, 56.47f, 128.0f)
                horizontalLineToRelative(-37.45f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, -5.67f, -2.34f)
                arcTo(7.99f, 7.99f, 0.0f, false, true, 11.0f, 120.0f)
                lineTo(11.0f, 93.33f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
