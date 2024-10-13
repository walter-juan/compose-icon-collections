package com.woowla.compose.icon.collections.devicons.devicons.vscode

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VscodeGroup

public val VscodeGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF0065A9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(123.47f, 13.82f)
                    lineTo(97.1f, 1.12f)
                    arcTo(7.97f, 7.97f, 0.0f, false, false, 88.0f, 2.67f)
                    lineTo(1.66f, 81.39f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, false, 0.01f, 7.89f)
                    lineToRelative(7.05f, 6.41f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, false, 6.81f, 0.3f)
                    lineToRelative(103.97f, -78.88f)
                    curveToRelative(3.49f, -2.65f, 8.5f, -0.16f, 8.5f, 4.22f)
                    verticalLineToRelative(-0.31f)
                    arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.53f, -7.21f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF007ACC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveToRelative(123.47f, 114.18f)
                    lineToRelative(-26.37f, 12.7f)
                    arcTo(7.97f, 7.97f, 0.0f, false, true, 88.0f, 125.33f)
                    lineTo(1.66f, 46.61f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, true, 0.01f, -7.89f)
                    lineToRelative(7.05f, -6.41f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, true, 6.81f, -0.3f)
                    lineToRelative(103.97f, 78.87f)
                    curveToRelative(3.49f, 2.65f, 8.5f, 0.16f, 8.5f, -4.22f)
                    verticalLineToRelative(0.31f)
                    arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.53f, 7.21f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1F9CF0)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(97.1f, 126.88f)
                    arcTo(7.98f, 7.98f, 0.0f, false, true, 88.0f, 125.33f)
                    curveToRelative(2.95f, 2.95f, 8.0f, 0.86f, 8.0f, -3.31f)
                    verticalLineTo(5.98f)
                    curveToRelative(0.0f, -4.18f, -5.05f, -6.27f, -8.0f, -3.31f)
                    arcToRelative(7.98f, 7.98f, 0.0f, false, true, 9.1f, -1.55f)
                    lineTo(123.47f, 13.8f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 21.01f)
                    verticalLineToRelative(85.98f)
                    arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.53f, 7.21f)
                    lineToRelative(-26.37f, 12.68f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0x00FFFFFF),
                        start = Offset(63.92f,0.33f), end = Offset(63.92f,127.67f)), stroke = null,
                        fillAlpha = 0.25f, strokeAlpha = 0.25f, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(90.69f, 127.13f)
                    arcToRelative(7.97f, 7.97f, 0.0f, false, false, 6.35f, -0.24f)
                    lineToRelative(26.35f, -12.68f)
                    arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, -7.21f)
                    lineTo(127.92f, 21.01f)
                    arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.53f, -7.21f)
                    lineTo(97.04f, 1.12f)
                    arcToRelative(7.97f, 7.97f, 0.0f, false, false, -9.09f, 1.55f)
                    lineToRelative(-50.45f, 46.03f)
                    lineToRelative(-21.97f, -16.68f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, false, -6.81f, 0.3f)
                    lineToRelative(-7.05f, 6.41f)
                    arcToRelative(5.34f, 5.34f, 0.0f, false, false, -0.01f, 7.89f)
                    lineTo(20.72f, 64.0f)
                    lineTo(1.66f, 81.39f)
                    arcToRelative(5.34f, 5.34f, 0.0f, false, false, 0.01f, 7.89f)
                    lineToRelative(7.05f, 6.41f)
                    arcToRelative(5.33f, 5.33f, 0.0f, false, false, 6.81f, 0.3f)
                    lineToRelative(21.98f, -16.68f)
                    lineToRelative(50.45f, 46.03f)
                    arcToRelative(7.96f, 7.96f, 0.0f, false, false, 2.74f, 1.79f)
                    close()
                    moveTo(95.94f, 34.94f)
                    lineTo(57.66f, 64.0f)
                    lineToRelative(38.28f, 29.06f)
                    lineTo(95.94f, 34.94f)
                    close()
                }
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
