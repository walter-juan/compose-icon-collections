package com.woowla.compose.icon.collections.devicons.devicons.ionic

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
import com.woowla.compose.icon.collections.devicons.devicons.IonicGroup

public val IonicGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4e8ef7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                moveToRelative(-24.08f, 0.0f)
                arcToRelative(24.08f, 24.08f, 0.0f, true, true, 48.16f, 0.0f)
                arcToRelative(24.08f, 24.08f, 0.0f, true, true, -48.16f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF4e8ef7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.14f, 23.14f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, -13.7f, -6.25f)
                arcToRelative(59.0f, 59.0f, 0.0f, true, false, 11.67f, 11.67f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, false, 2.03f, -5.42f)
                close()
                moveTo(64.0f, 121.0f)
                arcTo(57.0f, 57.0f, 0.0f, true, true, 98.1f, 18.36f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, 11.53f, 11.53f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 64.0f, 121.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
