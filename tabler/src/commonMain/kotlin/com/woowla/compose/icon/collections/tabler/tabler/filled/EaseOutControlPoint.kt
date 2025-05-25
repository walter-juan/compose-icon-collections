package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) {
            return _easeOutControlPoint!!
        }
        _easeOutControlPoint = Builder(name = "EaseOutControlPoint", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                curveToRelative(-1.097f, 0.0f, -2.317f, 0.361f, -3.64f, 1.068f)
                curveToRelative(-2.373f, 1.265f, -4.958f, 3.562f, -7.607f, 6.59f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -4.25f, 5.42f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, false, -1.003f, 1.456f)
                lineToRelative(-0.455f, 0.69f)
                quadToRelative(-0.132f, 0.204f, -0.196f, 0.306f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.696f, -1.06f)
                lineToRelative(0.286f, -0.445f)
                lineToRelative(0.173f, -0.264f)
                arcToRelative(73.0f, 73.0f, 0.0f, false, true, 1.26f, -1.839f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, 4.376f, -5.58f)
                curveToRelative(2.795f, -3.195f, 5.544f, -5.638f, 8.171f, -7.04f)
                curveToRelative(1.592f, -0.848f, 3.122f, -1.302f, 4.581f, -1.302f)
                moveToRelative(-16.0f, -2.0f)
                curveToRelative(1.306f, 0.0f, 2.418f, 0.835f, 2.83f, 2.0f)
                horizontalLineToRelative(1.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.829f, -4.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
