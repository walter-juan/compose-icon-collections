package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PersonArrowDownToLine: ImageVector
    get() {
        if (_personArrowDownToLine != null) {
            return _personArrowDownToLine!!
        }
        _personArrowDownToLine = Builder(name = "PersonArrowDownToLine", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, -32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(318.3f, 299.1f)
                lineToRelative(-46.3f, -62.4f)
                lineToRelative(0.0f, 243.3f)
                lineToRelative(272.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 544.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -243.3f)
                lineToRelative(-46.3f, 62.4f)
                curveToRelative(-10.5f, 14.2f, -30.6f, 17.2f, -44.8f, 6.6f)
                reflectiveCurveToRelative(-17.2f, -30.6f, -6.6f, -44.8f)
                lineToRelative(70.5f, -95.0f)
                curveTo(110.0f, 132.0f, 149.7f, 112.0f, 192.0f, 112.0f)
                reflectiveCurveToRelative(82.0f, 20.0f, 107.2f, 53.9f)
                lineToRelative(70.5f, 95.0f)
                curveToRelative(10.5f, 14.2f, 7.6f, 34.2f, -6.6f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.6f, -44.8f, -6.6f)
                close()
                moveTo(176.0f, 480.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 128.0f)
                close()
                moveTo(566.6f, 166.6f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.3f, 0.0f)
                lineTo(432.0f, 146.7f)
                lineTo(432.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 146.7f)
                lineToRelative(25.4f, -25.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                close()
            }
        }
        .build()
        return _personArrowDownToLine!!
    }

private var _personArrowDownToLine: ImageVector? = null
