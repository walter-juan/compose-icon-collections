package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxLemon: ImageVector
    get() {
        if (_bxLemon != null) {
            return _bxLemon!!
        }
        _bxLemon = Builder(name = "BxLemon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcToRelative(9.83f, 9.83f, 0.0f, false, true, -3.26f, -0.55f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.7f, 0.19f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -2.47f, 0.24f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, -2.45f, -2.45f)
                arcTo(3.51f, 3.51f, 0.0f, false, true, 2.36f, 17.0f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 0.19f, -1.7f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, true, 0.0f, -6.53f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, true, 6.18f, -6.23f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, true, 6.53f, 0.0f)
                arcTo(2.23f, 2.23f, 0.0f, false, false, 17.0f, 2.36f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 2.47f, -0.24f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, 2.45f, 2.45f)
                arcTo(3.51f, 3.51f, 0.0f, false, true, 21.64f, 7.0f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -0.19f, 1.7f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, true, 0.0f, 6.53f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, true, -6.19f, 6.19f)
                arcTo(10.33f, 10.33f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(8.16f, 19.36f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 1.23f, 0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.24f, 0.0f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, 4.94f, -4.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -5.24f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, 0.29f, -3.23f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 0.09f, -1.08f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, -1.08f, 0.09f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, -3.23f, 0.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.24f, 0.0f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, -4.97f, 4.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 5.24f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, -0.29f, 3.23f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, -0.09f, 1.08f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 1.08f, -0.09f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, 2.03f, -0.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxLemon!!
    }

private var _bxLemon: ImageVector? = null
