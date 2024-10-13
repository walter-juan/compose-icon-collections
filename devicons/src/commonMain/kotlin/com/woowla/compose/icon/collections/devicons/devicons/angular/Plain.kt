package com.woowla.compose.icon.collections.devicons.devicons.angular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AngularGroup

public val AngularGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.3f, 69.32f)
                lineTo(72.7f, 69.32f)
                lineTo(64.0f, 48.38f)
                close()
                moveTo(55.3f, 69.32f)
                moveTo(64.0f, 15.36f)
                lineTo(16.33f, 32.36f)
                lineTo(23.6f, 95.39f)
                lineTo(64.0f, 117.76f)
                lineTo(104.4f, 95.39f)
                lineTo(111.67f, 32.36f)
                close()
                moveTo(93.75f, 93.49f)
                lineTo(82.64f, 93.49f)
                lineTo(76.64f, 78.54f)
                lineTo(51.36f, 78.54f)
                lineTo(45.36f, 93.49f)
                lineTo(34.25f, 93.49f)
                lineTo(64.0f, 26.68f)
                close()
                moveTo(93.75f, 93.49f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
