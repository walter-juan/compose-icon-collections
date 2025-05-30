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

public val OutlineGroup.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.113f, -0.6f, 2.482f, -1.5f, 3.0f)
                lineToRelative(1.5f, 7.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.5f, -7.0f)
                curveToRelative(-0.9f, -0.518f, -1.5f, -1.887f, -1.5f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.684f, 16.772f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.684f, 0.949f)
                verticalLineToRelative(1.279f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.684f, -0.948f)
                lineToRelative(-2.316f, -0.772f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(-2.316f, 0.772f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
