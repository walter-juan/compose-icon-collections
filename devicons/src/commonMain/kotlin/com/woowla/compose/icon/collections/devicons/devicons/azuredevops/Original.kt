package com.woowla.compose.icon.collections.devicons.devicons.azuredevops

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AzuredevopsGroup

public val AzuredevopsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF0078D4), 0.16f to Color(0xFF1380DA), 0.53f
                    to Color(0xFF3C91E5), 0.82f to Color(0xFF559CEC), 1.0f to Color(0xFF5EA0EF),
                    start = Offset(64.0f,120.68f), end = Offset(64.0f,7.32f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.89f, 28.44f)
                verticalLineToRelative(69.26f)
                lineToRelative(-28.44f, 23.32f)
                lineToRelative(-44.09f, -16.07f)
                verticalLineToRelative(15.93f)
                lineTo(23.4f, 88.25f)
                lineToRelative(72.75f, 5.69f)
                lineTo(96.14f, 31.57f)
                close()
                moveTo(96.64f, 31.93f)
                lineTo(55.82f, 7.11f)
                verticalLineToRelative(16.28f)
                lineTo(18.35f, 34.42f)
                lineTo(7.11f, 48.85f)
                verticalLineToRelative(32.78f)
                lineToRelative(16.08f, 7.11f)
                lineTo(23.18f, 46.72f)
                close()
                moveTo(96.64f, 31.93f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
