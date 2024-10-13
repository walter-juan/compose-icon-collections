package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPaint: ImageVector
    get() {
        if (_bxsPaint != null) {
            return _bxsPaint!!
        }
        _bxsPaint = Builder(name = "BxsPaint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.084f, 2.914f)
                curveToRelative(-1.178f, -1.179f, -3.234f, -1.179f, -4.412f, 0.0f)
                lineToRelative(-8.379f, 8.379f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(8.379f, -8.379f)
                arcToRelative(3.123f, 3.123f, 0.0f, false, false, -0.002f, -4.414f)
                close()
                moveTo(19.672f, 5.914f)
                lineTo(12.0f, 13.586f)
                lineTo(10.414f, 12.0f)
                lineToRelative(7.672f, -7.672f)
                arcToRelative(1.146f, 1.146f, 0.0f, false, true, 1.586f, 0.002f)
                arcToRelative(1.123f, 1.123f, 0.0f, false, true, 0.0f, 1.584f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(-1.265f, -0.634f, -3.5f, 0.0f, -3.5f, 2.0f)
                curveToRelative(0.0f, 1.197f, 0.5f, 2.0f, -1.5f, 3.0f)
                curveToRelative(0.0f, 0.0f, 3.25f, 2.25f, 5.5f, 0.0f)
                curveToRelative(1.274f, -1.274f, 1.494f, -4.0f, -0.5f, -5.0f)
                close()
            }
        }
        .build()
        return _bxsPaint!!
    }

private var _bxsPaint: ImageVector? = null
