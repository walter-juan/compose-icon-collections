package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsZoomOut: ImageVector
    get() {
        if (_bxsZoomOut != null) {
            return _bxsZoomOut!!
        }
        _bxsZoomOut = Builder(name = "BxsZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                arcToRelative(7.952f, 7.952f, 0.0f, false, false, 4.897f, -1.688f)
                lineToRelative(4.396f, 4.396f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.396f, -4.396f)
                arcTo(7.952f, 7.952f, 0.0f, false, false, 18.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _bxsZoomOut!!
    }

private var _bxsZoomOut: ImageVector? = null
