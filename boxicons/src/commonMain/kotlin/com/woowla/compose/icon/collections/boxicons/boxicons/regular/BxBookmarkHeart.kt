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

public val RegularGroup.BxBookmarkHeart: ImageVector
    get() {
        if (_bxBookmarkHeart != null) {
            return _bxBookmarkHeart!!
        }
        _bxBookmarkHeart = Builder(name = "BxBookmarkHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(8.0f, -4.572f)
                lineTo(20.0f, 22.0f)
                close()
                moveTo(6.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(14.553f)
                lineToRelative(-6.0f, -3.428f)
                lineToRelative(-6.0f, 3.428f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.409f, 9.512f)
                curveToRelative(0.361f, -0.372f, 0.585f, -0.888f, 0.585f, -1.456f)
                reflectiveCurveToRelative(-0.223f, -1.083f, -0.585f, -1.456f)
                arcToRelative(1.962f, 1.962f, 0.0f, false, false, -1.412f, -0.603f)
                reflectiveCurveTo(13.001f, 5.994f, 12.0f, 7.026f)
                curveToRelative(-1.001f, -1.032f, -1.997f, -1.029f, -1.997f, -1.029f)
                curveToRelative(-0.552f, 0.0f, -1.051f, 0.23f, -1.412f, 0.603f)
                curveToRelative(-0.362f, 0.373f, -0.585f, 0.887f, -0.585f, 1.456f)
                reflectiveCurveToRelative(0.223f, 1.084f, 0.585f, 1.456f)
                lineTo(12.0f, 13.203f)
                lineToRelative(3.409f, -3.691f)
                close()
            }
        }
        .build()
        return _bxBookmarkHeart!!
    }

private var _bxBookmarkHeart: ImageVector? = null
