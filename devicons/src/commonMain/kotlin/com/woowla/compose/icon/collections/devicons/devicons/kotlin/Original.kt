package com.woowla.compose.icon.collections.devicons.devicons.kotlin

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
import com.woowla.compose.icon.collections.devicons.devicons.KotlinGroup

public val KotlinGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFE44857), 0.47f to Color(0xFFC711E1), 1.0f
                    to Color(0xFF7F52FF), start = Offset(112.48f,15.51f), end =
                    Offset(15.52f,112.48f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.48f, 112.48f)
                lineTo(15.52f, 112.48f)
                lineTo(15.52f, 15.52f)
                horizontalLineToRelative(96.97f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(112.48f, 112.48f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
