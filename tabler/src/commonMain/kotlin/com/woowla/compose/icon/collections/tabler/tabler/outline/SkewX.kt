package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.SkewX: ImageVector
    get() {
        if (_skewX != null) {
            return _skewX!!
        }
        _skewX = Builder(name = "SkewX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.205f)
                verticalLineToRelative(13.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.184f, 0.983f)
                lineToRelative(14.0f, -2.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.816f, -0.983f)
                verticalLineToRelative(-8.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.816f, -0.983f)
                lineToRelative(-14.0f, -2.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.184f, 0.983f)
                close()
            }
        }
        .build()
        return _skewX!!
    }

private var _skewX: ImageVector? = null
