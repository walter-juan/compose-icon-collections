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

public val RegularGroup.BxMeteor: ImageVector
    get() {
        if (_bxMeteor != null) {
            return _bxMeteor!!
        }
        _bxMeteor = Builder(name = "BxMeteor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 22.0f)
                curveToRelative(2.003f, 0.0f, 3.887f, -0.78f, 5.313f, -2.207f)
                lineToRelative(6.904f, -7.096f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 11.0f)
                horizontalLineToRelative(-3.301f)
                lineToRelative(4.175f, -7.514f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.359f, -1.36f)
                lineToRelative(-7.11f, 3.95f)
                lineToRelative(0.576f, -2.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.629f, -0.957f)
                lineTo(4.196f, 9.197f)
                curveToRelative(-2.924f, 2.924f, -2.924f, 7.682f, 0.0f, 10.606f)
                arcTo(7.452f, 7.452f, 0.0f, false, false, 9.5f, 22.0f)
                close()
                moveTo(5.552f, 10.665f)
                lineToRelative(5.902f, -5.031f)
                lineToRelative(-0.248f, 1.24f)
                lineToRelative(-0.186f, 0.93f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.424f, 2.119f)
                lineToRelative(7.83f, -4.35f)
                lineToRelative(-3.3f, 5.94f)
                lineToRelative(-0.001f, 0.001f)
                lineTo(14.301f, 13.0f)
                horizontalLineToRelative(4.331f)
                lineToRelative(-5.243f, 5.389f)
                curveTo(12.35f, 19.428f, 10.969f, 20.0f, 9.5f, 20.0f)
                reflectiveCurveToRelative(-2.851f, -0.572f, -3.89f, -1.611f)
                curveToRelative(-2.143f, -2.144f, -2.143f, -5.634f, -0.058f, -7.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 18.0f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 1.484f, -6.659f)
                curveToRelative(0.005f, 0.053f, 0.016f, 0.105f, 0.016f, 0.159f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                curveToRelative(0.0f, -0.054f, 0.011f, -0.106f, 0.016f, -0.159f)
                arcTo(3.492f, 3.492f, 0.0f, false, false, 9.5f, 18.0f)
                close()
            }
        }
        .build()
        return _bxMeteor!!
    }

private var _bxMeteor: ImageVector? = null
