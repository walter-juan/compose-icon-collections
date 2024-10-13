package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPyramid: ImageVector
    get() {
        if (_bxPyramid != null) {
            return _bxPyramid!!
        }
        _bxPyramid = Builder(name = "BxPyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.0f, 19.131f)
                verticalLineTo(6.0f)
                lineToRelative(6.565f, 8.754f)
                lineTo(13.0f, 19.131f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(13.131f)
                lineToRelative(-6.565f, -4.377f)
                lineTo(11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bxPyramid!!
    }

private var _bxPyramid: ImageVector? = null
