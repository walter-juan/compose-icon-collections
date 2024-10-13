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

public val SolidGroup.BxsPyramid: ImageVector
    get() {
        if (_bxsPyramid != null) {
            return _bxsPyramid!!
        }
        _bxsPyramid = Builder(name = "BxsPyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.445f, 21.832f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.11f, 0.0f)
                lineToRelative(9.0f, -6.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 21.8f, 14.4f)
                lineToRelative(-9.0f, -12.0f)
                curveToRelative(-0.377f, -0.504f, -1.223f, -0.504f, -1.6f, 0.0f)
                lineToRelative(-9.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.245f, 1.432f)
                lineToRelative(9.0f, 6.0f)
                close()
                moveTo(19.565f, 14.754f)
                lineTo(12.0f, 19.798f)
                lineTo(12.0f, 4.667f)
                lineToRelative(7.565f, 10.087f)
                close()
            }
        }
        .build()
        return _bxsPyramid!!
    }

private var _bxsPyramid: ImageVector? = null
