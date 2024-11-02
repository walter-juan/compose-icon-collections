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

public val Simpleicons.Codecrafters: ImageVector
    get() {
        if (_codecrafters != null) {
            return _codecrafters!!
        }
        _codecrafters = Builder(name = "Codecrafters", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.825f, 17.527f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.107f, -0.142f)
                lineToRelative(3.05f, -10.837f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.108f, -0.081f)
                lineTo(14.2f, 6.467f)
                curveToRelative(0.074f, 0.0f, 0.127f, 0.07f, 0.107f, 0.141f)
                lineToRelative(-3.063f, 10.838f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.107f, 0.08f)
                lineTo(9.825f, 17.526f)
                close()
                moveTo(7.679f, 14.795f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.079f, -0.033f)
                lineToRelative(-2.667f, -2.704f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.0f, -0.156f)
                lineTo(7.6f, 9.211f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.08f, -0.033f)
                horizontalLineToRelative(1.702f)
                curveToRelative(0.1f, 0.0f, 0.149f, 0.12f, 0.079f, 0.19f)
                lineToRelative(-2.534f, 2.534f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, false, 0.0f, 0.157f)
                lineToRelative(2.535f, 2.546f)
                curveToRelative(0.07f, 0.07f, 0.02f, 0.19f, -0.079f, 0.19f)
                lineTo(7.68f, 14.795f)
                close()
                moveTo(14.633f, 14.795f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.079f, -0.19f)
                lineToRelative(2.525f, -2.546f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, false, 0.0f, -0.157f)
                lineToRelative(-2.524f, -2.535f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.079f, -0.19f)
                horizontalLineToRelative(1.692f)
                curveToRelative(0.03f, 0.0f, 0.058f, 0.013f, 0.078f, 0.034f)
                lineToRelative(2.68f, 2.69f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.0f, 0.157f)
                lineToRelative(-2.68f, 2.704f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.078f, 0.033f)
                horizontalLineToRelative(-1.693f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 1.333f)
                curveTo(6.118f, 1.333f, 1.333f, 6.118f, 1.333f, 12.0f)
                reflectiveCurveTo(6.118f, 22.667f, 12.0f, 22.667f)
                reflectiveCurveTo(22.667f, 17.882f, 22.667f, 12.0f)
                reflectiveCurveTo(17.882f, 1.333f, 12.0f, 1.333f)
                close()
            }
        }
        .build()
        return _codecrafters!!
    }

private var _codecrafters: ImageVector? = null
