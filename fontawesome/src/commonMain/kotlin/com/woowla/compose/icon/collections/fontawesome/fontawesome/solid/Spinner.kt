package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(208.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(48.0f, 208.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(416.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(75.0f, 369.1f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 142.9f, 437.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 75.0f, 369.1f)
                close()
                moveTo(75.0f, 75.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 142.9f, 142.9f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 75.0f, 75.0f)
                close()
                moveTo(437.0f, 369.1f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 369.1f, 437.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 437.0f, 369.1f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
