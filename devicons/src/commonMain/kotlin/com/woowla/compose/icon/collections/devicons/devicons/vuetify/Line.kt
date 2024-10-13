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

public val VuetifyGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1697F6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(68.09f, 10.17f)
                lineToRelative(-66.29f, 0.0f)
                lineToRelative(0.43f, 0.75f)
                lineToRelative(30.67f, 53.13f)
                lineToRelative(2.04f, 3.55f)
                lineToRelative(23.32f, -40.4f)
                close()
                moveTo(78.71f, 10.17f)
                lineTo(78.57f, 10.42f)
                lineTo(64.86f, 34.16f)
                lineTo(40.26f, 76.79f)
                lineTo(64.0f, 117.92f)
                lineToRelative(31.1f, -53.88f)
                lineToRelative(31.09f, -53.88f)
                close()
                moveTo(3.54f, 11.17f)
                horizontalLineToRelative(62.83f)
                lineToRelative(-8.97f, 15.52f)
                lineToRelative(-22.45f, 38.9f)
                lineToRelative(-1.17f, -2.04f)
                close()
                moveTo(79.29f, 11.17f)
                horizontalLineToRelative(45.17f)
                lineTo(94.24f, 63.55f)
                lineTo(64.0f, 115.92f)
                lineTo(41.42f, 76.79f)
                lineTo(65.73f, 34.66f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
