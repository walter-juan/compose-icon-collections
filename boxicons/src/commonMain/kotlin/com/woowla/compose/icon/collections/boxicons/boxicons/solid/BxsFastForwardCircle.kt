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

public val SolidGroup.BxsFastForwardCircle: ImageVector
    get() {
        if (_bxsFastForwardCircle != null) {
            return _bxsFastForwardCircle!!
        }
        _bxsFastForwardCircle = Builder(name = "BxsFastForwardCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.485f, 2.0f, 2.0f, 6.485f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.485f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.485f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-6.0f, 4.0f)
                lineTo(7.0f, 8.0f)
                lineToRelative(6.0f, 4.0f)
                lineTo(13.0f, 8.0f)
                lineToRelative(6.0f, 4.0f)
                lineToRelative(-6.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsFastForwardCircle!!
    }

private var _bxsFastForwardCircle: ImageVector? = null
