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

public val OutlineGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -3.1f, 1.4f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                lineToRelative(0.01f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                lineToRelative(0.01f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.0f, 0.0f)
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
