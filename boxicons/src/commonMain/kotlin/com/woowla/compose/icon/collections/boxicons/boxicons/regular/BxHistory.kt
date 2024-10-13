package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxHistory: ImageVector
    get() {
        if (_bxHistory != null) {
            return _bxHistory!!
        }
        _bxHistory = Builder(name = "BxHistory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.292f, 8.497f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, false, -1.928f, -2.862f)
                arcToRelative(9.004f, 9.004f, 0.0f, false, false, -4.55f, -2.452f)
                arcToRelative(9.09f, 9.09f, 0.0f, false, false, -3.626f, 0.0f)
                arcToRelative(8.965f, 8.965f, 0.0f, false, false, -4.552f, 2.453f)
                arcToRelative(9.048f, 9.048f, 0.0f, false, false, -1.928f, 2.86f)
                arcTo(8.963f, 8.963f, 0.0f, false, false, 4.0f, 12.0f)
                lineToRelative(0.001f, 0.025f)
                horizontalLineTo(2.0f)
                lineTo(5.0f, 16.0f)
                lineToRelative(3.0f, -3.975f)
                horizontalLineTo(6.001f)
                lineTo(6.0f, 12.0f)
                arcToRelative(6.957f, 6.957f, 0.0f, false, true, 1.195f, -3.913f)
                arcToRelative(7.066f, 7.066f, 0.0f, false, true, 1.891f, -1.892f)
                arcToRelative(7.034f, 7.034f, 0.0f, false, true, 2.503f, -1.054f)
                arcToRelative(7.003f, 7.003f, 0.0f, false, true, 8.269f, 5.445f)
                arcToRelative(7.117f, 7.117f, 0.0f, false, true, 0.0f, 2.824f)
                arcToRelative(6.936f, 6.936f, 0.0f, false, true, -1.054f, 2.503f)
                curveToRelative(-0.25f, 0.371f, -0.537f, 0.72f, -0.854f, 1.036f)
                arcToRelative(7.058f, 7.058f, 0.0f, false, true, -2.225f, 1.501f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, -1.313f, 0.408f)
                arcToRelative(7.117f, 7.117f, 0.0f, false, true, -2.823f, 0.0f)
                arcToRelative(6.957f, 6.957f, 0.0f, false, true, -2.501f, -1.053f)
                arcToRelative(7.066f, 7.066f, 0.0f, false, true, -1.037f, -0.855f)
                lineToRelative(-1.414f, 1.414f)
                arcTo(8.985f, 8.985f, 0.0f, false, false, 13.0f, 21.0f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, false, 3.503f, -0.707f)
                arcToRelative(9.009f, 9.009f, 0.0f, false, false, 3.959f, -3.26f)
                arcTo(8.968f, 8.968f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(8.928f, 8.928f, 0.0f, false, false, -0.708f, -3.503f)
                close()
            }
        }
        .build()
        return _bxHistory!!
    }

private var _bxHistory: ImageVector? = null
