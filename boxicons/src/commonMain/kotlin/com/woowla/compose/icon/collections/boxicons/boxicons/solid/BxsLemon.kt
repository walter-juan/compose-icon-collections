package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsLemon: ImageVector
    get() {
        if (_bxsLemon != null) {
            return _bxsLemon!!
        }
        _bxsLemon = Builder(name = "BxsLemon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.45f, 8.74f)
                arcTo(2.23f, 2.23f, 0.0f, false, true, 21.64f, 7.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.24f, -2.47f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, false, -2.45f, -2.45f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -2.43f, 0.28f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, true, -1.7f, 0.19f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, false, -6.53f, 0.0f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, false, -6.23f, 6.18f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, false, 0.0f, 6.53f)
                arcTo(2.23f, 2.23f, 0.0f, false, true, 2.36f, 17.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -0.24f, 2.47f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, false, 2.45f, 2.45f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 7.0f, 21.64f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, true, 1.7f, -0.19f)
                arcTo(9.83f, 9.83f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(10.33f, 10.33f, 0.0f, false, false, 3.27f, -0.54f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, false, 6.19f, -6.19f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, false, -0.01f, -6.53f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                horizontalLineTo(5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _bxsLemon!!
    }

private var _bxsLemon: ImageVector? = null
