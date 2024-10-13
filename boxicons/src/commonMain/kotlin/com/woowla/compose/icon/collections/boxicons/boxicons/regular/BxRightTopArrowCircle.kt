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

public val RegularGroup.BxRightTopArrowCircle: ImageVector
    get() {
        if (_bxRightTopArrowCircle != null) {
            return _bxRightTopArrowCircle!!
        }
        _bxRightTopArrowCircle = Builder(name = "BxRightTopArrowCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.006f, 2.007f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, -7.071f, 2.922f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.243f, 0.0f, 14.142f)
                curveToRelative(1.885f, 1.885f, 4.396f, 2.923f, 7.071f, 2.923f)
                reflectiveCurveToRelative(5.187f, -1.038f, 7.071f, -2.923f)
                curveToRelative(3.898f, -3.898f, 3.898f, -10.242f, 0.0f, -14.142f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, -7.071f, -2.922f)
                close()
                moveTo(17.663f, 17.656f)
                curveToRelative(-1.507f, 1.507f, -3.517f, 2.337f, -5.657f, 2.337f)
                reflectiveCurveToRelative(-4.15f, -0.83f, -5.657f, -2.337f)
                curveToRelative(-3.118f, -3.119f, -3.118f, -8.194f, 0.0f, -11.313f)
                curveToRelative(1.507f, -1.507f, 3.516f, -2.336f, 5.657f, -2.336f)
                reflectiveCurveToRelative(4.15f, 0.829f, 5.657f, 2.336f)
                curveToRelative(3.118f, 3.119f, 3.118f, 8.194f, 0.0f, 11.313f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.467f, 11.125f)
                lineToRelative(-3.214f, 3.214f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.214f, -3.214f)
                lineToRelative(2.125f, 2.124f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.343f)
                close()
            }
        }
        .build()
        return _bxRightTopArrowCircle!!
    }

private var _bxRightTopArrowCircle: ImageVector? = null
