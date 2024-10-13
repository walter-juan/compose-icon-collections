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

public val RegularGroup.BxPolygon: ImageVector
    get() {
        if (_bxPolygon != null) {
            return _bxPolygon!!
        }
        _bxPolygon = Builder(name = "BxPolygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 2.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
                lineToRelative(-5.0f, 5.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(5.0f, 5.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.266f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineToRelative(5.0f, -5.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(20.0f, 15.586f)
                lineTo(15.586f, 20.0f)
                horizontalLineTo(8.414f)
                lineTo(4.0f, 15.586f)
                verticalLineTo(8.414f)
                lineTo(8.414f, 4.0f)
                horizontalLineToRelative(7.172f)
                lineTo(20.0f, 8.414f)
                verticalLineToRelative(7.172f)
                close()
            }
        }
        .build()
        return _bxPolygon!!
    }

private var _bxPolygon: ImageVector? = null
