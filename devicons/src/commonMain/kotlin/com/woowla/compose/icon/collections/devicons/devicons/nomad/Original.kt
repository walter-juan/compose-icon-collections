package com.woowla.compose.icon.collections.devicons.devicons.nomad

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NomadGroup

public val NomadGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00ca8e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                lineTo(8.57f, 31.98f)
                verticalLineToRelative(64.01f)
                lineTo(64.0f, 128.0f)
                lineToRelative(55.43f, -32.0f)
                lineTo(119.43f, 31.98f)
                close()
                moveTo(88.7f, 70.39f)
                lineTo(73.92f, 78.9f)
                lineTo(56.08f, 69.21f)
                verticalLineToRelative(20.42f)
                lineToRelative(-16.78f, 10.61f)
                lineTo(39.3f, 57.6f)
                lineToRelative(13.31f, -8.15f)
                lineToRelative(18.47f, 9.73f)
                lineTo(71.08f, 38.4f)
                lineToRelative(17.63f, -10.58f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
