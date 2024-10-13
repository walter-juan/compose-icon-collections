package com.woowla.compose.icon.collections.devicons.devicons.vuejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VuejsGroup

public val VuejsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF35495e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.93f)
                lineToRelative(49.85f, 0.16f)
                lineToRelative(14.3f, 24.42f)
                lineToRelative(14.3f, -24.42f)
                lineToRelative(49.55f, -0.16f)
                lineToRelative(-63.83f, 110.13f)
                close()
                moveTo(126.99f, 9.57f)
                lineToRelative(-24.37f, 0.02f)
                lineToRelative(-38.47f, 66.05f)
                lineTo(25.69f, 9.59f)
                lineToRelative(-24.75f, -0.02f)
                lineToRelative(63.21f, 107.89f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
