package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.38f, 0.948f)
                arcTo(11.963f, 11.963f, 0.0f, false, true, 21.248f, 19.54f)
                lineToRelative(2.41f, 2.422f)
                curveToRelative(0.732f, 0.736f, 0.21f, 1.99f, -0.827f, 1.99f)
                lineToRelative(-10.71f, 0.01f)
                arcToRelative(12.52f, 12.52f, 0.0f, false, true, -0.304f, 0.0f)
                horizontalLineToRelative(-0.02f)
                arcTo(11.963f, 11.963f, 0.0f, false, true, 7.382f, 0.95f)
                close()
                moveTo(14.702f, 5.376f)
                arcToRelative(7.172f, 7.172f, 0.0f, true, false, -5.487f, 13.251f)
                arcToRelative(7.172f, 7.172f, 0.0f, false, false, 5.488f, -13.251f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
