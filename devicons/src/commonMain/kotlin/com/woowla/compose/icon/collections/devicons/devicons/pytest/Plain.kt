package com.woowla.compose.icon.collections.devicons.devicons.pytest

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PytestGroup

public val PytestGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF009fe3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.51f, 30.4f)
                horizontalLineToRelative(61.3f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 0.0f, 6.01f)
                lineTo(31.51f, 36.41f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, -3.0f, -3.0f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 3.0f, -3.01f)
                close()
                moveTo(32.05f, 24.32f)
                lineTo(44.37f, 24.32f)
                verticalLineToRelative(2.84f)
                lineTo(32.05f, 27.16f)
                close()
                moveTo(48.17f, 24.32f)
                horizontalLineToRelative(12.32f)
                verticalLineToRelative(2.84f)
                lineTo(48.17f, 27.16f)
                close()
                moveTo(64.07f, 24.32f)
                horizontalLineToRelative(12.33f)
                verticalLineToRelative(2.84f)
                lineTo(64.07f, 27.16f)
                close()
                moveTo(79.91f, 24.32f)
                horizontalLineToRelative(12.32f)
                verticalLineToRelative(2.84f)
                lineTo(79.91f, 27.16f)
                close()
                moveTo(79.91f, 39.54f)
                horizontalLineToRelative(12.32f)
                verticalLineToRelative(20.83f)
                lineTo(79.91f, 60.38f)
                close()
                moveTo(64.07f, 39.54f)
                horizontalLineToRelative(12.35f)
                verticalLineToRelative(33.85f)
                lineTo(64.07f, 73.39f)
                close()
                moveTo(48.17f, 39.54f)
                horizontalLineToRelative(12.32f)
                verticalLineToRelative(50.7f)
                lineTo(48.17f, 90.24f)
                close()
                moveTo(32.05f, 39.54f)
                lineTo(44.37f, 39.54f)
                verticalLineToRelative(61.79f)
                lineTo(32.05f, 101.33f)
                close()
                moveTo(32.05f, 39.54f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
