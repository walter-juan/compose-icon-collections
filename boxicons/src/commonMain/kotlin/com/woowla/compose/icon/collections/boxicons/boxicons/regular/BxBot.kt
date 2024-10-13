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

public val RegularGroup.BxBot: ImageVector
    get() {
        if (_bxBot != null) {
            return _bxBot!!
        }
        _bxBot = Builder(name = "BxBot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.928f, 11.607f)
                curveToRelative(-0.202f, -0.488f, -0.635f, -0.605f, -0.928f, -0.633f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(4.61f)
                curveToRelative(0.305f, -0.274f, 0.5f, -0.668f, 0.5f, -1.11f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 0.442f, 0.195f, 0.836f, 0.5f, 1.11f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.997f)
                lineToRelative(-0.082f, 0.006f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.99f, 12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.938f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.072f, -0.455f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(0.001f, 3.996f)
                lineTo(19.0f, 12.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(0.001f, 0.005f)
                lineToRelative(0.001f, 5.995f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                arcToRelative(1.5f, 2.0f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 2.0f, 0.0f, true, false, -3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                arcToRelative(1.5f, 2.0f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 2.0f, 0.0f, true, false, -3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bxBot!!
    }

private var _bxBot: ImageVector? = null
