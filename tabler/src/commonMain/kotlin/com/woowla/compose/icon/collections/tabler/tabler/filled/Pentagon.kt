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

public val FilledGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.205f, 2.6f)
                lineToRelative(-6.96f, 5.238f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.045f, 3.338f)
                lineToRelative(2.896f, 8.765f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.85f, 2.059f)
                horizontalLineToRelative(8.12f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.841f, -2.037f)
                lineToRelative(2.973f, -8.764f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.05f, -3.37f)
                lineToRelative(-7.033f, -5.237f)
                lineToRelative(-0.091f, -0.061f)
                lineToRelative(-0.018f, -0.01f)
                lineToRelative(-0.106f, -0.07f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.377f, 0.148f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
