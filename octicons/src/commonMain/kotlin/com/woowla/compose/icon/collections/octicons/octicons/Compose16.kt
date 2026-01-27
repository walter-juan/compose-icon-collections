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

public val Octicons.Compose16: ImageVector
    get() {
        if (_compose16 != null) {
            return _compose16!!
        }
        _compose16 = Builder(name = "Compose16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.515f, 0.456f)
                lineToRelative(0.965f, 0.965f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, true, 0.0f, 2.2f)
                lineTo(9.745f, 9.355f)
                arcToRelative(1.549f, 1.549f, 0.0f, false, true, -0.672f, 0.396f)
                lineToRelative(-2.89f, 0.826f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, -0.828f, -0.474f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.004f, -0.35f)
                lineToRelative(0.825f, -2.89f)
                curveToRelative(0.073f, -0.254f, 0.209f, -0.486f, 0.396f, -0.673f)
                lineTo(12.315f, 0.456f)
                curveToRelative(0.144f, -0.145f, 0.316f, -0.259f, 0.505f, -0.337f)
                arcToRelative(1.538f, 1.538f, 0.0f, false, true, 1.19f, 0.0f)
                curveToRelative(0.189f, 0.078f, 0.361f, 0.192f, 0.505f, 0.337f)
                close()
                moveTo(11.193f, 3.464f)
                lineTo(7.523f, 7.133f)
                arcToRelative(0.214f, 0.214f, 0.0f, false, false, -0.057f, 0.096f)
                lineTo(6.97f, 8.965f)
                lineToRelative(1.736f, -0.496f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, false, 0.096f, -0.056f)
                lineToRelative(3.67f, -3.67f)
                close()
                moveTo(13.258f, 1.398f)
                lineTo(12.135f, 2.52f)
                lineToRelative(1.28f, 1.28f)
                lineToRelative(1.122f, -1.122f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, 0.065f, -0.157f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, -0.065f, -0.157f)
                lineToRelative(-0.965f, -0.966f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, -0.157f, -0.065f)
                arcToRelative(0.226f, 0.226f, 0.0f, false, false, -0.157f, 0.065f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.25f)
                verticalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.75f, 1.0f)
                horizontalLineTo(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 13.25f, 16.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                close()
            }
        }
        .build()
        return _compose16!!
    }

private var _compose16: ImageVector? = null
