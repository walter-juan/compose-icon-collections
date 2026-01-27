package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Sparkles2: ImageVector
    get() {
        if (_sparkles2 != null) {
            return _sparkles2!!
        }
        _sparkles2 = Builder(name = "Sparkles2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 1.516f, -0.546f)
                curveToRelative(0.911f, -0.438f, 1.494f, -1.015f, 1.937f, -1.932f)
                curveToRelative(0.207f, -0.428f, 0.382f, -0.928f, 0.547f, -1.522f)
                curveToRelative(0.165f, 0.595f, 0.34f, 1.095f, 0.547f, 1.521f)
                curveToRelative(0.443f, 0.918f, 1.026f, 1.495f, 1.937f, 1.933f)
                curveToRelative(0.426f, 0.205f, 0.925f, 0.38f, 1.516f, 0.546f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, -1.516f, 0.547f)
                curveToRelative(-0.911f, 0.438f, -1.494f, 1.015f, -1.937f, 1.932f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.547f, 1.521f)
                curveToRelative(-0.165f, -0.594f, -0.34f, -1.095f, -0.547f, -1.521f)
                curveToRelative(-0.443f, -0.918f, -1.026f, -1.494f, -1.937f, -1.932f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.516f, -0.547f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 1.652f, -0.532f)
                curveToRelative(2.542f, -0.953f, 3.853f, -2.238f, 4.816f, -4.806f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.532f, -1.662f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.532f, 1.662f)
                curveToRelative(0.963f, 2.567f, 2.275f, 3.853f, 4.816f, 4.806f)
                quadToRelative(0.75f, 0.28f, 1.652f, 0.532f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, -1.652f, 0.532f)
                curveToRelative(-2.542f, 0.953f, -3.854f, 2.238f, -4.816f, 4.806f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.532f, 1.662f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.532f, -1.662f)
                curveToRelative(-0.963f, -2.568f, -2.275f, -3.853f, -4.816f, -4.806f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, -1.652f, -0.532f)
            }
        }
        .build()
        return _sparkles2!!
    }

private var _sparkles2: ImageVector? = null
