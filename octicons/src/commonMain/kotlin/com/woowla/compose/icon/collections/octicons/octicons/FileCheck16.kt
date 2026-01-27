package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.FileCheck16: ImageVector
    get() {
        if (_fileCheck16 != null) {
            return _fileCheck16!!
        }
        _fileCheck16 = Builder(name = "FileCheck16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.336f, 0.0f)
                curveToRelative(0.464f, 0.0f, 0.91f, 0.184f, 1.237f, 0.513f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.33f, 0.328f, 0.513f, 0.773f, 0.513f, 1.237f)
                verticalLineToRelative(3.587f)
                curveToRelative(0.0f, 0.199f, -0.079f, 0.39f, -0.22f, 0.53f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.06f, 0.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.22f, -0.53f)
                lineTo(13.5f, 6.0f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-0.464f, 0.0f, -0.909f, -0.184f, -1.237f, -0.513f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 9.0f, 4.25f)
                lineTo(9.0f, 1.5f)
                lineTo(3.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(7.0f, 14.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcTo(0.747f, 0.747f, 0.0f, false, true, 7.0f, 16.0f)
                lineTo(3.75f, 16.0f)
                curveToRelative(-0.464f, 0.0f, -0.909f, -0.184f, -1.237f, -0.513f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 2.0f, 14.25f)
                lineTo(2.0f, 1.75f)
                curveTo(2.0f, 0.784f, 2.784f, 0.0f, 3.75f, 0.0f)
                close()
                moveTo(10.5f, 4.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.688f)
                lineToRelative(-0.011f, -0.013f)
                lineToRelative(-2.914f, -2.914f)
                lineToRelative(-0.013f, -0.011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.259f, 10.0f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 0.686f, 0.472f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, -0.171f, 0.815f)
                lineToRelative(-4.557f, 4.45f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -1.055f, -0.01f)
                lineTo(8.22f, 13.778f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 0.04f, -1.02f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 1.02f, -0.038f)
                lineToRelative(1.42f, 1.425f)
                lineToRelative(4.025f, -3.932f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.534f, -0.213f)
                close()
            }
        }
        .build()
        return _fileCheck16!!
    }

private var _fileCheck16: ImageVector? = null
