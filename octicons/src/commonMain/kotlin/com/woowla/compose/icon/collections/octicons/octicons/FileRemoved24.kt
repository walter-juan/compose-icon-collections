package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.FileRemoved24: ImageVector
    get() {
        if (_fileRemoved24 != null) {
            return _fileRemoved24!!
        }
        _fileRemoved24 = Builder(name = "FileRemoved24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(9.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(4.018f, 4.018f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.018f)
                lineTo(21.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(5.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(5.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(19.5f, 7.018f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.354f)
                lineToRelative(-4.018f, -4.018f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.354f, -0.146f)
                lineTo(5.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveToRelative(0.0f, -0.414f, 0.358f, -0.75f, 0.8f, -0.75f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.442f, 0.0f, 0.8f, 0.336f, 0.8f, 0.75f)
                reflectiveCurveToRelative(-0.358f, 0.75f, -0.8f, 0.75f)
                horizontalLineTo(8.8f)
                curveToRelative(-0.442f, 0.0f, -0.8f, -0.336f, -0.8f, -0.75f)
                close()
            }
        }
        .build()
        return _fileRemoved24!!
    }

private var _fileRemoved24: ImageVector? = null
