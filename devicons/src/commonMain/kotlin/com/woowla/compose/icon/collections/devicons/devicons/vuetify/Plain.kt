package com.woowla.compose.icon.collections.devicons.devicons.vuetify

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VuetifyGroup

public val VuetifyGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1697f6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.67f, 10.67f)
                lineTo(33.34f, 63.8f)
                lineToRelative(1.61f, 2.79f)
                lineToRelative(22.88f, -39.65f)
                lineToRelative(9.4f, -16.27f)
                close()
                moveTo(79.0f, 10.67f)
                lineTo(65.3f, 34.41f)
                lineTo(40.84f, 76.79f)
                lineTo(64.0f, 116.92f)
                lineToRelative(30.67f, -53.13f)
                lineToRelative(30.66f, -53.13f)
                close()
                moveTo(79.0f, 10.67f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
