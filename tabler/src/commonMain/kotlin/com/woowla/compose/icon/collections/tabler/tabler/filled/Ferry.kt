package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Ferry: ImageVector
    get() {
        if (_ferry != null) {
            return _ferry!!
        }
        _ferry = Builder(name = "Ferry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.86f, 1.51f)
                lineToRelative(-2.202f, 3.709f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -3.365f, 1.781f)
                horizontalLineToRelative(-15.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.957f, -1.291f)
                lineToRelative(1.521f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.957f, -0.709f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-5.106f, -7.447f)
                lineToRelative(0.723f, 1.447f)
                horizontalLineToRelative(0.874f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.864f, 0.497f)
                lineToRelative(2.037f, 3.503f)
                horizontalLineToRelative(-12.832f)
                lineToRelative(0.973f, -3.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.958f, -0.716f)
                horizontalLineToRelative(4.89f)
                lineToRelative(-0.275f, -0.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.788f, -0.894f)
            }
        }
        .build()
        return _ferry!!
    }

private var _ferry: ImageVector? = null
