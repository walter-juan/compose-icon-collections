package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsUserCircle: ImageVector
    get() {
        if (_bxsUserCircle != null) {
            return _bxsUserCircle!!
        }
        _bxsUserCircle = Builder(name = "BxsUserCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.579f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.579f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.727f, 0.0f, 3.0f, 1.272f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.273f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.726f, 0.0f, -3.0f, -1.272f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.274f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.894f, 16.772f)
                curveToRelative(0.897f, -1.32f, 2.393f, -2.2f, 4.106f, -2.2f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.714f, 0.0f, 3.209f, 0.88f, 4.106f, 2.2f)
                curveTo(15.828f, 18.14f, 14.015f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveToRelative(-3.828f, -0.86f, -5.106f, -2.228f)
                close()
            }
        }
        .build()
        return _bxsUserCircle!!
    }

private var _bxsUserCircle: ImageVector? = null
