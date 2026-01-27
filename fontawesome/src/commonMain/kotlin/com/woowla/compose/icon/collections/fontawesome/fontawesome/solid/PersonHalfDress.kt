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

public val SolidGroup.PersonHalfDress: ImageVector
    get() {
        if (_personHalfDress != null) {
            return _personHalfDress!!
        }
        _personHalfDress = Builder(name = "PersonHalfDress", defaultWidth = 384.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.4f, -3.9f)
                curveToRelative(9.7f, -16.8f, 27.8f, -28.1f, 48.6f, -28.1f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                curveToRelative(0.0f, 25.4f, -16.9f, 46.8f, -40.0f, 53.7f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-5.1f, 1.5f, -10.4f, 2.3f, -16.0f, 2.3f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, -10.1f, 2.7f, -19.7f, 7.4f, -27.9f)
                close()
                moveTo(318.3f, 299.1f)
                lineTo(272.0f, 236.7f)
                lineTo(272.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(0.0f, -0.4f)
                lineToRelative(0.0f, -238.6f)
                curveToRelative(36.2f, 4.4f, 69.2f, 23.4f, 91.2f, 53.0f)
                lineToRelative(70.5f, 95.0f)
                curveToRelative(10.5f, 14.2f, 7.6f, 34.2f, -6.6f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.6f, -44.8f, -6.6f)
                close()
                moveTo(176.0f, 113.0f)
                lineToRelative(0.0f, 399.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-25.8f, 0.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, -10.7f, -15.2f, -21.1f)
                lineToRelative(43.0f, -129.0f)
                lineToRelative(-48.3f, 65.1f)
                curveToRelative(-10.5f, 14.2f, -30.6f, 17.2f, -44.8f, 6.6f)
                reflectiveCurveToRelative(-17.2f, -30.6f, -6.6f, -44.8f)
                lineToRelative(70.5f, -95.0f)
                curveToRelative(22.0f, -29.6f, 55.1f, -48.6f, 91.2f, -53.0f)
                close()
            }
        }
        .build()
        return _personHalfDress!!
    }

private var _personHalfDress: ImageVector? = null
