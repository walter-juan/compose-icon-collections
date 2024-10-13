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

public val RegularGroup.BxDirections: ImageVector
    get() {
        if (_bxDirections != null) {
            return _bxDirections!!
        }
        _bxDirections = Builder(name = "BxDirections", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.781f, 13.875f)
                lineToRelative(-2.0f, -2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.781f, 0.375f)
                lineToRelative(-2.0f, 2.5f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.0f, 1.25f)
                lineToRelative(2.0f, 2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.781f, -0.375f)
                lineToRelative(2.0f, -2.5f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.0f, -1.25f)
                close()
                moveTo(4.281f, 5.5f)
                lineTo(5.48f, 4.0f)
                horizontalLineTo(19.0f)
                lineToRelative(0.002f, 3.0f)
                horizontalLineTo(5.48f)
                lineTo(4.281f, 5.5f)
                close()
                moveTo(18.52f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.52f)
                lineToRelative(1.2f, 1.5f)
                lineToRelative(-1.2f, 1.5f)
                close()
            }
        }
        .build()
        return _bxDirections!!
    }

private var _bxDirections: ImageVector? = null
