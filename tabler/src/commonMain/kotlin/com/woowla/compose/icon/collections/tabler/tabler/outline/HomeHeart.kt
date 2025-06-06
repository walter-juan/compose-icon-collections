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

public val OutlineGroup.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(-9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.39f, 0.0f, 0.754f, 0.112f, 1.061f, 0.304f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 21.5f)
                lineToRelative(2.518f, -2.58f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.0f, -2.413f)
                arcToRelative(1.627f, 1.627f, 0.0f, false, false, -2.346f, 0.0f)
                lineToRelative(-0.168f, 0.172f)
                lineToRelative(-0.168f, -0.172f)
                arcToRelative(1.627f, 1.627f, 0.0f, false, false, -2.346f, 0.0f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.0f, 2.412f)
                lineToRelative(2.51f, 2.59f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
