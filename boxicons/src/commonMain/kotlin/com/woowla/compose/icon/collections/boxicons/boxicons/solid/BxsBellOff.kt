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

public val SolidGroup.BxsBellOff: ImageVector
    get() {
        if (_bxsBellOff != null) {
            return _bxsBellOff!!
        }
        _bxsBellOff = Builder(name = "BxsBellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.345f, 18.931f)
                arcTo(0.993f, 0.993f, 0.0f, false, false, 21.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineTo(19.0f, 14.586f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -3.217f, -2.185f, -5.927f, -5.145f, -6.742f)
                curveTo(13.562f, 2.52f, 12.846f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.562f, 0.52f, -1.855f, 1.258f)
                curveToRelative(-1.323f, 0.364f, -2.463f, 1.128f, -3.346f, 2.127f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.362f, -1.362f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, 2.818f, -2.0f)
                horizontalLineTo(9.182f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 12.0f, 22.0f)
                close()
                moveTo(5.0f, 10.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-1.707f, 1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 3.0f, 17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.879f)
                lineTo(5.068f, 9.189f)
                curveTo(5.037f, 9.457f, 5.0f, 9.724f, 5.0f, 10.0f)
                close()
            }
        }
        .build()
        return _bxsBellOff!!
    }

private var _bxsBellOff: ImageVector? = null
