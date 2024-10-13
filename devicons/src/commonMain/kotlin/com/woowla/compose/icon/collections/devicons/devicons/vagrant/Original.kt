package com.woowla.compose.icon.collections.devicons.devicons.vagrant

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
import com.woowla.compose.icon.collections.devicons.devicons.VagrantGroup

public val VagrantGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1159cc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.5f, 23.9f)
                verticalLineTo(12.82f)
                lineTo(95.91f, 28.3f)
                verticalLineToRelative(9.34f)
                lineToRelative(-21.28f, 45.9f)
                lineToRelative(-10.64f, 7.33f)
                verticalLineToRelative(33.61f)
                lineToRelative(22.81f, -13.15f)
                lineToRelative(35.7f, -87.43f)
                close()
                moveTo(63.99f, 66.94f)
                lineTo(48.04f, 29.71f)
                verticalLineTo(19.19f)
                lineToRelative(-0.11f, -0.06f)
                lineToRelative(-15.84f, 9.17f)
                verticalLineToRelative(9.34f)
                lineToRelative(21.27f, 47.91f)
                lineToRelative(10.63f, -5.25f)
                verticalLineTo(66.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF127eff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.55f, 3.52f)
                lineTo(79.97f, 19.09f)
                lineToRelative(-0.02f, -0.01f)
                verticalLineTo(29.71f)
                lineTo(63.99f, 66.94f)
                verticalLineToRelative(12.45f)
                lineToRelative(-10.63f, 6.16f)
                lineToRelative(-21.27f, -47.91f)
                verticalLineToRelative(-9.36f)
                lineToRelative(15.96f, -9.19f)
                lineToRelative(-26.6f, -15.57f)
                lineToRelative(-15.95f, 9.3f)
                verticalLineToRelative(11.42f)
                lineToRelative(35.9f, 87.2f)
                lineToRelative(22.59f, 13.04f)
                verticalLineTo(91.72f)
                lineToRelative(10.64f, -6.17f)
                lineToRelative(-0.13f, -0.08f)
                lineToRelative(21.41f, -47.83f)
                verticalLineToRelative(-9.36f)
                lineToRelative(26.59f, -15.46f)
                lineToRelative(-15.95f, -9.3f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
