package com.woowla.compose.icon.collections.devicons.devicons.google

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GoogleGroup

public val GoogleGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF587dbd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.59f, 4.21f)
                arcToRelative(63.28f, 63.28f, 0.0f, false, false, 4.33f, 120.9f)
                arcToRelative(67.6f, 67.6f, 0.0f, false, false, 32.36f, 0.35f)
                arcToRelative(57.13f, 57.13f, 0.0f, false, false, 25.9f, -13.46f)
                arcToRelative(57.44f, 57.44f, 0.0f, false, false, 16.0f, -26.26f)
                arcToRelative(74.33f, 74.33f, 0.0f, false, false, 1.61f, -33.58f)
                horizontalLineTo(65.27f)
                verticalLineToRelative(24.69f)
                horizontalLineToRelative(34.47f)
                arcToRelative(29.72f, 29.72f, 0.0f, false, true, -12.66f, 19.52f)
                arcToRelative(36.16f, 36.16f, 0.0f, false, true, -13.93f, 5.5f)
                arcToRelative(41.29f, 41.29f, 0.0f, false, true, -15.1f, 0.0f)
                arcTo(37.16f, 37.16f, 0.0f, false, true, 44.0f, 95.74f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, true, -14.5f, -19.42f)
                arcToRelative(38.31f, 38.31f, 0.0f, false, true, 0.0f, -24.63f)
                arcToRelative(39.25f, 39.25f, 0.0f, false, true, 9.18f, -14.91f)
                arcTo(37.17f, 37.17f, 0.0f, false, true, 76.13f, 27.0f)
                arcToRelative(34.28f, 34.28f, 0.0f, false, true, 13.64f, 8.0f)
                quadToRelative(5.83f, -5.8f, 11.64f, -11.63f)
                curveToRelative(2.0f, -2.09f, 4.18f, -4.08f, 6.15f, -6.22f)
                arcTo(61.22f, 61.22f, 0.0f, false, false, 87.2f, 4.59f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -42.61f, -0.38f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
