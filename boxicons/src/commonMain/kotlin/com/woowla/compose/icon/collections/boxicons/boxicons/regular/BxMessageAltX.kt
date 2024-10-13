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

public val RegularGroup.BxMessageAltX: ImageVector
    get() {
        if (_bxMessageAltX != null) {
            return _bxMessageAltX!!
        }
        _bxMessageAltX = Builder(name = "BxMessageAltX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.586f, 18.0f)
                lineTo(12.0f, 21.414f)
                lineTo(15.414f, 18.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.586f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(12.0f, 18.586f)
                lineTo(9.414f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.707f, 13.707f)
                lineTo(12.0f, 11.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 8.586f)
                lineTo(9.707f, 6.293f)
                lineTo(8.293f, 7.707f)
                lineTo(10.586f, 10.0f)
                lineToRelative(-2.293f, 2.293f)
                close()
            }
        }
        .build()
        return _bxMessageAltX!!
    }

private var _bxMessageAltX: ImageVector? = null
