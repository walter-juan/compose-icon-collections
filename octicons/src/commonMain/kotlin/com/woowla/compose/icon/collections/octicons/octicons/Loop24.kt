package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Loop24: ImageVector
    get() {
        if (_loop24 != null) {
            return _loop24!!
        }
        _loop24 = Builder(name = "Loop24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.109f, 5.603f)
                arcToRelative(9.001f, 9.001f, 0.0f, false, true, 12.728f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.061f, 1.061f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -10.606f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.0f, 10.606f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 10.606f, 0.0f)
                lineToRelative(5.821f, -5.82f)
                horizontalLineTo(17.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.083f)
                lineToRelative(-5.713f, 5.714f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.109f, 5.603f)
                close()
            }
        }
        .build()
        return _loop24!!
    }

private var _loop24: ImageVector? = null
