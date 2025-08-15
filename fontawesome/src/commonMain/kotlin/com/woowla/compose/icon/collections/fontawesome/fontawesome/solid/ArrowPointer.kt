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

public val SolidGroup.ArrowPointer: ImageVector
    get() {
        if (_arrowPointer != null) {
            return _arrowPointer!!
        }
        _arrowPointer = Builder(name = "ArrowPointer", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.3f, 2.5f)
                curveToRelative(8.1f, -4.1f, 17.9f, -3.2f, 25.1f, 2.3f)
                lineToRelative(320.0f, 239.9f)
                curveToRelative(8.3f, 6.2f, 11.6f, 17.0f, 8.4f, 26.8f)
                reflectiveCurveToRelative(-12.4f, 16.4f, -22.8f, 16.4f)
                lineToRelative(-152.3f, 0.0f)
                lineToRelative(88.9f, 177.7f)
                curveToRelative(7.9f, 15.8f, 1.5f, 35.0f, -14.3f, 42.9f)
                reflectiveCurveToRelative(-35.0f, 1.5f, -42.9f, -14.3f)
                lineToRelative(-88.9f, -177.7f)
                lineToRelative(-91.3f, 121.8f)
                curveToRelative(-6.2f, 8.3f, -17.0f, 11.6f, -26.8f, 8.4f)
                reflectiveCurveTo(64.0f, 434.3f, 64.0f, 424.0f)
                lineTo(64.0f, 24.0f)
                curveToRelative(0.0f, -9.1f, 5.1f, -17.4f, 13.3f, -21.5f)
                close()
            }
        }
        .build()
        return _arrowPointer!!
    }

private var _arrowPointer: ImageVector? = null
