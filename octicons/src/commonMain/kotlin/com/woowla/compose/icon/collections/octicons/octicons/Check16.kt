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

public val Octicons.Check16: ImageVector
    get() {
        if (_check16 != null) {
            return _check16!!
        }
        _check16 = Builder(name = "Check16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.78f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-7.25f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineTo(2.22f, 9.28f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                lineTo(6.0f, 10.94f)
                lineToRelative(6.72f, -6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _check16!!
    }

private var _check16: ImageVector? = null
