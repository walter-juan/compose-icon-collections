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

public val OutlineGroup.Filter2Dollar: ImageVector
    get() {
        if (_filter2Dollar != null) {
            return _filter2Dollar!!
        }
        _filter2Dollar = Builder(name = "Filter2Dollar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                moveToRelative(-2.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(0.0f, -1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.398f, 0.0f, 0.779f, -0.158f, 1.061f, -0.439f)
                curveToRelative(0.281f, -0.281f, 0.439f, -0.663f, 0.439f, -1.061f)
                curveToRelative(0.0f, -0.398f, -0.158f, -0.779f, -0.439f, -1.061f)
                curveToRelative(-0.281f, -0.281f, -0.663f, -0.439f, -1.061f, -0.439f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.398f, 0.0f, -0.779f, -0.158f, -1.061f, -0.439f)
                curveToRelative(-0.281f, -0.281f, -0.439f, -0.663f, -0.439f, -1.061f)
                curveToRelative(0.0f, -0.398f, 0.158f, -0.779f, 0.439f, -1.061f)
                curveToRelative(0.281f, -0.281f, 0.663f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(0.5f)
                moveToRelative(0.0f, -1.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _filter2Dollar!!
    }

private var _filter2Dollar: ImageVector? = null
