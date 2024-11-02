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

public val Simpleicons.Statista: ImageVector
    get() {
        if (_statista != null) {
            return _statista!!
        }
        _statista = Builder(name = "Statista", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.86f, 0.0f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.84f, 0.84f)
                verticalLineToRelative(15.217f)
                lineTo(0.14f, 16.057f)
                reflectiveCurveToRelative(3.611f, -0.068f, 5.143f, -0.874f)
                arcToRelative(10.89f, 10.89f, 0.0f, false, false, 3.337f, -3.051f)
                lineToRelative(0.903f, -1.275f)
                lineToRelative(0.286f, -0.406f)
                curveToRelative(0.034f, -0.04f, 0.182f, -0.257f, 0.268f, -0.383f)
                reflectiveCurveToRelative(0.458f, -0.651f, 0.818f, -1.176f)
                arcToRelative(16.94f, 16.94f, 0.0f, false, true, 5.262f, -4.743f)
                curveToRelative(3.337f, -1.714f, 7.76f, -1.542f, 7.76f, -1.542f)
                horizontalLineToRelative(0.068f)
                lineTo(23.985f, 0.892f)
                arcTo(0.84f, 0.84f, 0.0f, false, false, 23.146f, 0.0f)
                close()
                moveTo(23.979f, 7.949f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.217f, 0.029f)
                reflectiveCurveToRelative(-3.605f, 0.068f, -5.154f, 0.879f)
                arcToRelative(10.86f, 10.86f, 0.0f, false, false, -3.338f, 3.046f)
                lineToRelative(-0.885f, 1.28f)
                curveToRelative(-0.131f, 0.183f, -0.257f, 0.365f, -0.291f, 0.405f)
                lineToRelative(-0.269f, 0.383f)
                lineToRelative(-0.817f, 1.177f)
                reflectiveCurveToRelative(-2.178f, 3.143f, -5.263f, 4.743f)
                curveToRelative(-3.2f, 1.663f, -7.388f, 1.554f, -7.731f, 1.543f)
                verticalLineToRelative(1.714f)
                arcTo(0.84f, 0.84f, 0.0f, false, false, 0.854f, 24.0f)
                horizontalLineToRelative(22.286f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.839f, -0.84f)
                close()
            }
        }
        .build()
        return _statista!!
    }

private var _statista: ImageVector? = null
