package com.woowla.compose.icon.collections.devicons.devicons.tensorflow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TensorflowGroup

public val TensorflowGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFff6f00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(61.55f, 128.0f)
                lineToRelative(-21.84f, -12.68f)
                verticalLineTo(40.55f)
                lineTo(6.81f, 59.56f)
                lineToRelative(0.08f, -28.32f)
                lineTo(61.55f, 0.0f)
                close()
                moveTo(66.46f, 0.0f)
                verticalLineToRelative(128.0f)
                lineToRelative(21.84f, -12.68f)
                verticalLineTo(79.31f)
                lineToRelative(16.49f, 9.53f)
                lineToRelative(-0.1f, -24.63f)
                lineToRelative(-16.39f, -9.36f)
                verticalLineToRelative(-14.3f)
                lineToRelative(32.89f, 19.01f)
                lineToRelative(-0.08f, -28.32f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
