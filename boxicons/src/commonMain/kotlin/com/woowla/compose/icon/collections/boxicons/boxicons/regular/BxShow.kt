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

public val RegularGroup.BxShow: ImageVector
    get() {
        if (_bxShow != null) {
            return _bxShow!!
        }
        _bxShow = Builder(name = "BxShow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.642f, 1.358f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.641f, 0.0f, 3.0f, -1.358f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.641f, -1.359f, -3.0f, -3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(-7.633f, 0.0f, -9.927f, 6.617f, -9.948f, 6.684f)
                lineTo(1.946f, 12.0f)
                lineToRelative(0.105f, 0.316f)
                curveTo(2.073f, 12.383f, 4.367f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveToRelative(9.927f, -6.617f, 9.948f, -6.684f)
                lineToRelative(0.106f, -0.316f)
                lineToRelative(-0.105f, -0.316f)
                curveTo(21.927f, 11.617f, 19.633f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-5.351f, 0.0f, -7.424f, -3.846f, -7.926f, -5.0f)
                curveTo(4.578f, 10.842f, 6.652f, 7.0f, 12.0f, 7.0f)
                curveToRelative(5.351f, 0.0f, 7.424f, 3.846f, 7.926f, 5.0f)
                curveToRelative(-0.504f, 1.158f, -2.578f, 5.0f, -7.926f, 5.0f)
                close()
            }
        }
        .build()
        return _bxShow!!
    }

private var _bxShow: ImageVector? = null
