package com.woowla.compose.icon.collections.devicons.devicons.protractor

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
import com.woowla.compose.icon.collections.devicons.devicons.ProtractorGroup

public val ProtractorGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFed163a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 63.99f)
                curveToRelative(0.0f, 35.35f, -28.65f, 64.0f, -64.0f, 64.0f)
                curveTo(28.65f, 128.0f, 0.0f, 99.35f, 0.0f, 64.0f)
                curveTo(0.0f, 28.65f, 28.65f, 0.0f, 64.0f, 0.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, 28.65f, 64.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0xFFd51c2f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(97.04f, 33.13f)
                lineToRelative(-21.77f, -0.2f)
                lineToRelative(-12.72f, -12.73f)
                lineToRelative(-14.94f, 9.93f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(-6.05f, -0.05f)
                lineToRelative(-20.55f, 34.56f)
                horizontalLineToRelative(-8.05f)
                lineToRelative(5.05f, 5.06f)
                lineToRelative(-5.09f, 8.57f)
                lineToRelative(47.14f, 47.14f)
                lineToRelative(1.36f, 0.01f)
                curveToRelative(35.31f, 0.0f, 63.95f, -28.61f, 64.0f, -63.91f)
                lineTo(97.04f, 33.13f)
            }
            path(fill = SolidColor(Color(0xFFf5f5f5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.46f, 68.68f)
                arcToRelative(31.53f, 31.53f, 0.0f, true, true, 63.06f, 0.0f)
                close()
                moveTo(103.35f, 70.13f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(9.12f)
                arcTo(48.3f, 48.3f, 0.0f, false, false, 99.3f, 35.43f)
                lineToRelative(-6.82f, 6.82f)
                lineToRelative(-2.06f, -2.06f)
                lineToRelative(6.81f, -6.82f)
                arcToRelative(48.29f, 48.29f, 0.0f, false, false, -31.79f, -13.16f)
                verticalLineToRelative(9.12f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-9.12f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, false, -31.79f, 13.16f)
                lineToRelative(6.82f, 6.82f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(-6.82f, -6.82f)
                arcToRelative(48.31f, 48.31f, 0.0f, false, false, -13.16f, 31.79f)
                horizontalLineToRelative(9.12f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(-9.16f)
                verticalLineToRelative(10.67f)
                lineTo(112.5f, 80.8f)
                lineTo(112.5f, 70.13f)
                horizontalLineToRelative(-9.15f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
