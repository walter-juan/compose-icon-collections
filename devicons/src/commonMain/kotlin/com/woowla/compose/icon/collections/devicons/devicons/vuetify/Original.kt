package com.woowla.compose.icon.collections.devicons.devicons.vuetify

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
import com.woowla.compose.icon.collections.devicons.devicons.VuetifyGroup

public val VuetifyGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1697f6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.3f, 34.41f)
                lineTo(40.84f, 76.79f)
                lineTo(64.0f, 116.93f)
                lineToRelative(30.67f, -53.13f)
                lineToRelative(30.66f, -53.13f)
                lineTo(79.0f, 10.67f)
                close()
                moveTo(65.3f, 34.41f)
            }
            path(fill = SolidColor(Color(0xFFaeddff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(33.34f, 63.8f)
                lineToRelative(1.61f, 2.79f)
                lineToRelative(22.88f, -39.65f)
                lineToRelative(9.4f, -16.27f)
                lineTo(2.67f, 10.67f)
                close()
                moveTo(33.34f, 63.8f)
            }
            path(fill = SolidColor(Color(0xFF1867c0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.0f, 10.67f)
                curveTo(90.59f, 48.82f, 64.0f, 116.93f, 64.0f, 116.93f)
                lineTo(40.84f, 76.79f)
                close()
                moveTo(79.0f, 10.67f)
            }
            path(fill = SolidColor(Color(0xFF7bc6ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.23f, 10.67f)
                curveToRelative(-48.84f, 0.0f, -32.28f, 55.92f, -32.28f, 55.92f)
                close()
                moveTo(67.23f, 10.67f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
