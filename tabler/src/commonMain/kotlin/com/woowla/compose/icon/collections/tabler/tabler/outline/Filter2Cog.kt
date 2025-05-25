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

public val OutlineGroup.Filter2Cog: ImageVector
    get() {
        if (_filter2Cog != null) {
            return _filter2Cog!!
        }
        _filter2Cog = Builder(name = "Filter2Cog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.001f, 21.0f)
                curveToRelative(-0.53f, 0.0f, -1.039f, -0.211f, -1.414f, -0.586f)
                curveToRelative(-0.375f, -0.375f, -0.586f, -0.884f, -0.586f, -1.414f)
                curveToRelative(0.0f, -0.53f, 0.211f, -1.039f, 0.586f, -1.414f)
                curveToRelative(0.375f, -0.375f, 0.884f, -0.586f, 1.414f, -0.586f)
                moveToRelative(0.0f, 4.0f)
                curveToRelative(0.53f, 0.0f, 1.039f, -0.211f, 1.414f, -0.586f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.414f)
                curveToRelative(0.0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(1.5f)
                moveToRelative(0.0f, -5.5f)
                verticalLineToRelative(-1.5f)
                moveToRelative(3.031f, 1.75f)
                lineToRelative(-1.299f, 0.75f)
                moveToRelative(-3.463f, 2.0f)
                lineToRelative(-1.3f, 0.75f)
                moveToRelative(0.0f, -3.5f)
                lineToRelative(1.3f, 0.75f)
                moveToRelative(3.463f, 2.0f)
                lineToRelative(1.3f, 0.75f)
            }
        }
        .build()
        return _filter2Cog!!
    }

private var _filter2Cog: ImageVector? = null
