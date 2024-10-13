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

public val RegularGroup.BxMask: ImageVector
    get() {
        if (_bxMask != null) {
            return _bxMask!!
        }
        _bxMask = Builder(name = "BxMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(3.346f, 6.0f, 2.0f, 7.346f, 2.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.637f)
                curveToRelative(1.166f, 0.0f, 2.28f, -0.557f, 2.981f, -1.491f)
                curveToRelative(0.66f, -0.879f, 2.104f, -0.88f, 2.764f, 0.001f)
                arcTo(3.744f, 3.744f, 0.0f, false, false, 16.363f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.637f)
                curveToRelative(-0.54f, 0.0f, -1.057f, -0.259f, -1.382f, -0.69f)
                curveToRelative(-0.71f, -0.948f, -1.797f, -1.492f, -2.981f, -1.492f)
                reflectiveCurveToRelative(-2.271f, 0.544f, -2.981f, 1.491f)
                arcTo(1.741f, 1.741f, 0.0f, false, true, 7.637f, 16.0f)
                lineTo(6.0f, 16.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.5f)
                arcToRelative(2.5f, 1.5f, 0.0f, true, false, 5.0f, 0.0f)
                arcToRelative(2.5f, 1.5f, 0.0f, true, false, -5.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.5f)
                arcToRelative(2.5f, 1.5f, 0.0f, true, false, 5.0f, 0.0f)
                arcToRelative(2.5f, 1.5f, 0.0f, true, false, -5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bxMask!!
    }

private var _bxMask: ImageVector? = null
