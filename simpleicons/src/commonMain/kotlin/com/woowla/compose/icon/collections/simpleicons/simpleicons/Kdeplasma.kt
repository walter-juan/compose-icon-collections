package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Kdeplasma: ImageVector
    get() {
        if (_kdeplasma != null) {
            return _kdeplasma!!
        }
        _kdeplasma = Builder(name = "Kdeplasma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                curveToRelative(-0.831f, 0.0f, -1.5f, 0.669f, -1.5f, 1.5f)
                reflectiveCurveTo(5.169f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveToRelative(1.5f, -0.669f, 1.5f, -1.5f)
                reflectiveCurveTo(6.831f, 0.0f, 6.0f, 0.0f)
                moveToRelative(10.5f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(18.0f, 7.5f)
                lineTo(13.5f, 12.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(2.25f, 9.0f)
                arcTo(2.245f, 2.245f, 0.0f, false, false, 0.0f, 11.25f)
                arcToRelative(2.245f, 2.245f, 0.0f, false, false, 2.25f, 2.25f)
                arcToRelative(2.245f, 2.245f, 0.0f, false, false, 2.25f, -2.25f)
                arcTo(2.245f, 2.245f, 0.0f, false, false, 2.25f, 9.0f)
                moveTo(9.0f, 18.0f)
                curveToRelative(-1.662f, 0.0f, -3.0f, 1.338f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.338f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.338f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.338f, -3.0f, -3.0f, -3.0f)
            }
        }
        .build()
        return _kdeplasma!!
    }

private var _kdeplasma: ImageVector? = null
