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

public val RegularGroup.BxLeftTopArrowCircle: ImageVector
    get() {
        if (_bxLeftTopArrowCircle != null) {
            return _bxLeftTopArrowCircle!!
        }
        _bxLeftTopArrowCircle = Builder(name = "BxLeftTopArrowCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 2.007f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, -7.071f, 2.922f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.0f, 14.143f)
                arcToRelative(9.931f, 9.931f, 0.0f, false, false, 7.071f, 2.923f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, 7.071f, -2.923f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.143f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, -7.071f, -2.922f)
                close()
                moveTo(17.65f, 17.657f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, true, -5.657f, 2.337f)
                curveToRelative(-2.141f, 0.0f, -4.15f, -0.83f, -5.657f, -2.337f)
                curveToRelative(-3.119f, -3.119f, -3.119f, -8.195f, 0.0f, -11.314f)
                arcToRelative(7.946f, 7.946f, 0.0f, false, true, 5.657f, -2.336f)
                curveToRelative(2.142f, 0.0f, 4.15f, 0.829f, 5.657f, 2.336f)
                curveToRelative(3.12f, 3.119f, 3.12f, 8.195f, 0.0f, 11.314f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.657f, 9.0f)
                horizontalLineTo(8.993f)
                verticalLineToRelative(5.663f)
                lineToRelative(2.125f, -2.124f)
                lineToRelative(3.215f, 3.214f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.215f, -3.214f)
                close()
            }
        }
        .build()
        return _bxLeftTopArrowCircle!!
    }

private var _bxLeftTopArrowCircle: ImageVector? = null
