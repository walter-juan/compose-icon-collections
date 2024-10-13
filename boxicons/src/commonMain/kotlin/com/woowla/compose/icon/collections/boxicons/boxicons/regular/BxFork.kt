package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxFork: ImageVector
    get() {
        if (_bxFork != null) {
            return _bxFork!!
        }
        _bxFork = Builder(name = "BxFork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.47f, 13.77f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(5.66f, -5.65f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-5.65f, 5.66f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-6.36f, 6.37f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.24f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-6.37f, 6.36f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(6.36f, -6.37f)
                lineToRelative(0.71f, 0.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(6.37f, -6.36f)
                lineToRelative(-1.42f, -1.42f)
                close()
            }
        }
        .build()
        return _bxFork!!
    }

private var _bxFork: ImageVector? = null
