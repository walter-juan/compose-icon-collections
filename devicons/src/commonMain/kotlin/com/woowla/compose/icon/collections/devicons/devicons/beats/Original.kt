package com.woowla.compose.icon.collections.devicons.devicons.beats

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
import com.woowla.compose.icon.collections.devicons.devicons.BeatsGroup

public val BeatsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.35f, 54.22f)
                arcTo(39.83f, 39.83f, 0.0f, false, false, 96.0f, 40.0f)
                curveTo(96.0f, 17.91f, 78.09f, 0.0f, 56.0f, 0.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(60.0f)
                curveToRelative(7.86f, 0.0f, 15.17f, 2.3f, 21.35f, 6.22f)
            }
            path(fill = SolidColor(Color(0xFF00bfb3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.81f, 62.5f)
                curveTo(94.4f, 79.92f, 76.61f, 92.0f, 56.0f, 92.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(60.0f)
                curveToRelative(22.09f, 0.0f, 40.0f, -17.91f, 40.0f, -40.0f)
                arcToRelative(39.83f, 39.83f, 0.0f, false, false, -9.19f, -25.51f)
            }
            path(fill = SolidColor(Color(0xFF343741)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.35f, 54.22f)
                arcTo(39.79f, 39.79f, 0.0f, false, false, 72.0f, 48.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(44.0f)
                curveToRelative(17.08f, 0.0f, 31.61f, -10.72f, 37.35f, -25.78f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
