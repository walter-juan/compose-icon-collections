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

public val RegularGroup.BxPin: ImageVector
    get() {
        if (_bxPin != null) {
            return _bxPin!!
        }
        _bxPin = Builder(name = "BxPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 22.0f)
                lineToRelative(1.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.526f, -0.214f, -1.042f, -0.586f, -1.414f)
                lineTo(17.0f, 11.586f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(3.586f)
                lineTo(5.586f, 13.0f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 5.0f, 14.414f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(1.0f, 2.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.0f, 14.414f)
                lineToRelative(1.707f, -1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 9.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineTo(17.0f, 14.414f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-0.586f)
                close()
            }
        }
        .build()
        return _bxPin!!
    }

private var _bxPin: ImageVector? = null
