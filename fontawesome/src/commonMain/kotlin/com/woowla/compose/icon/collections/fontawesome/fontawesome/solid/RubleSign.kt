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

public val SolidGroup.RubleSign: ImageVector
    get() {
        if (_rubleSign != null) {
            return _rubleSign!!
        }
        _rubleSign = Builder(name = "RubleSign", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 32.0f)
                curveTo(94.3f, 32.0f, 80.0f, 46.3f, 80.0f, 64.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(-40.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-40.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(152.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-152.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveTo(335.5f, 32.0f, 256.0f, 32.0f)
                lineTo(112.0f, 32.0f)
                close()
                moveTo(256.0f, 256.0f)
                lineToRelative(-112.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.8f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _rubleSign!!
    }

private var _rubleSign: ImageVector? = null
