package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsTennisBall: ImageVector
    get() {
        if (_bxsTennisBall != null) {
            return _bxsTennisBall!!
        }
        _bxsTennisBall = Builder(name = "BxsTennisBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 19.071f)
                arcToRelative(9.953f, 9.953f, 0.0f, false, false, 6.692f, 2.906f)
                curveToRelative(-0.463f, -2.773f, 0.365f, -5.721f, 2.5f, -7.856f)
                curveToRelative(2.136f, -2.135f, 5.083f, -2.963f, 7.856f, -2.5f)
                curveToRelative(-0.092f, -2.433f, -1.053f, -4.839f, -2.906f, -6.692f)
                reflectiveCurveToRelative(-4.26f, -2.814f, -6.692f, -2.906f)
                curveToRelative(0.463f, 2.773f, -0.365f, 5.721f, -2.5f, 7.856f)
                curveToRelative(-2.136f, 2.135f, -5.083f, 2.963f, -7.856f, 2.5f)
                arcToRelative(9.944f, 9.944f, 0.0f, false, false, 2.906f, 6.692f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 15.535f)
                arcToRelative(6.996f, 6.996f, 0.0f, false, false, -1.911f, 6.318f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, false, 8.229f, -8.229f)
                arcToRelative(6.999f, 6.999f, 0.0f, false, false, -6.318f, 1.911f)
                close()
                moveTo(8.465f, 8.465f)
                arcToRelative(6.996f, 6.996f, 0.0f, false, false, 1.911f, -6.318f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, false, -8.23f, 8.229f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 6.319f, -1.911f)
                close()
            }
        }
        .build()
        return _bxsTennisBall!!
    }

private var _bxsTennisBall: ImageVector? = null
