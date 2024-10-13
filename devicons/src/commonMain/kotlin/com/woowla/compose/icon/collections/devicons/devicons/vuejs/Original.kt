package com.woowla.compose.icon.collections.devicons.devicons.vuejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VuejsGroup

public val VuejsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF35495e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 9.39f)
                lineToRelative(23.0f, 0.01f)
                lineTo(64.04f, 34.36f)
                lineTo(79.02f, 9.4f)
                lineTo(102.0f, 9.4f)
                lineTo(64.15f, 75.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF41b883)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.91f, 9.57f)
                lineToRelative(25.07f, -0.17f)
                lineToRelative(38.15f, 65.66f)
                lineTo(101.98f, 9.4f)
                lineToRelative(25.11f, 0.03f)
                lineToRelative(-62.97f, 108.06f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
