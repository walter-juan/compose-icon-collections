package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlGoogleCloud: ImageVector
    get() {
        if (_bxlGoogleCloud != null) {
            return _bxlGoogleCloud!!
        }
        _bxlGoogleCloud = Builder(name = "BxlGoogleCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.511f, 9.722f)
                arcToRelative(7.833f, 7.833f, 0.0f, false, false, -2.359f, -3.804f)
                lineToRelative(-0.035f, 0.035f)
                lineToRelative(0.005f, -0.042f)
                arcTo(7.81f, 7.81f, 0.0f, false, false, 4.418f, 9.722f)
                curveToRelative(0.031f, -0.013f, 0.066f, -0.013f, 0.099f, -0.023f)
                arcToRelative(5.643f, 5.643f, 0.0f, false, false, -0.306f, 9.166f)
                lineToRelative(0.006f, -0.006f)
                lineToRelative(-0.006f, 0.024f)
                arcToRelative(5.612f, 5.612f, 0.0f, false, false, 3.407f, 1.134f)
                horizontalLineToRelative(4.321f)
                lineToRelative(0.024f, 0.024f)
                horizontalLineToRelative(4.341f)
                arcToRelative(5.644f, 5.644f, 0.0f, false, false, 3.207f, -10.319f)
                close()
                moveTo(16.305f, 16.567f)
                horizontalLineToRelative(-4.341f)
                lineToRelative(-0.006f, 0.006f)
                verticalLineToRelative(-0.031f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-0.308f, 0.0f, -0.611f, -0.066f, -0.892f, -0.193f)
                lineToRelative(0.002f, -0.001f)
                arcToRelative(2.17f, 2.17f, 0.0f, true, true, 2.87f, -2.871f)
                lineToRelative(2.518f, -2.518f)
                arcToRelative(5.634f, 5.634f, 0.0f, false, false, -3.396f, -2.1f)
                curveToRelative(0.018f, -0.009f, 0.035f, -0.024f, 0.05f, -0.021f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, 5.931f, -0.451f)
                horizontalLineToRelative(0.046f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, 1.558f, 3.407f)
                verticalLineToRelative(0.433f)
                arcToRelative(2.17f, 2.17f, 0.0f, true, true, 0.0f, 4.34f)
                close()
            }
        }
        .build()
        return _bxlGoogleCloud!!
    }

private var _bxlGoogleCloud: ImageVector? = null
