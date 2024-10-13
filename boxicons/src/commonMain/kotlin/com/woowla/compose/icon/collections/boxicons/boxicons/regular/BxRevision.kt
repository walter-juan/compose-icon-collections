package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxRevision: ImageVector
    get() {
        if (_bxRevision != null) {
            return _bxRevision!!
        }
        _bxRevision = Builder(name = "BxRevision", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.89f, 10.105f)
                arcToRelative(8.696f, 8.696f, 0.0f, false, false, -0.789f, -1.456f)
                lineToRelative(-1.658f, 1.119f)
                arcToRelative(6.606f, 6.606f, 0.0f, false, true, 0.987f, 2.345f)
                arcToRelative(6.659f, 6.659f, 0.0f, false, true, 0.0f, 2.648f)
                arcToRelative(6.495f, 6.495f, 0.0f, false, true, -0.384f, 1.231f)
                arcToRelative(6.404f, 6.404f, 0.0f, false, true, -0.603f, 1.112f)
                arcToRelative(6.654f, 6.654f, 0.0f, false, true, -1.776f, 1.775f)
                arcToRelative(6.606f, 6.606f, 0.0f, false, true, -2.343f, 0.987f)
                arcToRelative(6.734f, 6.734f, 0.0f, false, true, -2.646f, 0.0f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -3.317f, -1.788f)
                arcToRelative(6.605f, 6.605f, 0.0f, false, true, -1.408f, -2.088f)
                arcToRelative(6.613f, 6.613f, 0.0f, false, true, -0.382f, -1.23f)
                arcToRelative(6.627f, 6.627f, 0.0f, false, true, 0.382f, -3.877f)
                arcTo(6.551f, 6.551f, 0.0f, false, true, 7.36f, 8.797f)
                arcTo(6.628f, 6.628f, 0.0f, false, true, 9.446f, 7.39f)
                curveToRelative(0.395f, -0.167f, 0.81f, -0.296f, 1.23f, -0.382f)
                curveToRelative(0.107f, -0.022f, 0.216f, -0.032f, 0.324f, -0.049f)
                verticalLineTo(10.0f)
                lineToRelative(5.0f, -4.0f)
                lineToRelative(-5.0f, -4.0f)
                verticalLineToRelative(2.938f)
                arcToRelative(8.805f, 8.805f, 0.0f, false, false, -0.725f, 0.111f)
                arcToRelative(8.512f, 8.512f, 0.0f, false, false, -3.063f, 1.29f)
                arcTo(8.566f, 8.566f, 0.0f, false, false, 4.11f, 16.77f)
                arcToRelative(8.535f, 8.535f, 0.0f, false, false, 1.835f, 2.724f)
                arcToRelative(8.614f, 8.614f, 0.0f, false, false, 2.721f, 1.833f)
                arcToRelative(8.55f, 8.55f, 0.0f, false, false, 5.061f, 0.499f)
                arcToRelative(8.576f, 8.576f, 0.0f, false, false, 6.162f, -5.056f)
                curveToRelative(0.22f, -0.52f, 0.389f, -1.061f, 0.5f, -1.608f)
                arcToRelative(8.643f, 8.643f, 0.0f, false, false, 0.0f, -3.45f)
                arcToRelative(8.684f, 8.684f, 0.0f, false, false, -0.499f, -1.607f)
                close()
            }
        }
        .build()
        return _bxRevision!!
    }

private var _bxRevision: ImageVector? = null
