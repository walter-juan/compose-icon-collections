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

public val Simpleicons.Veed: ImageVector
    get() {
        if (_veed != null) {
            return _veed!!
        }
        _veed = Builder(name = "Veed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.985f, 3.448f)
                lineToRelative(-6.471f, 15.871f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, -2.235f, 1.502f)
                horizontalLineTo(8.739f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, -2.234f, -1.5f)
                lineTo(0.015f, 3.448f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, true, 0.181f, -0.27f)
                horizontalLineToRelative(6.55f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, 0.367f, 0.254f)
                lineToRelative(4.906f, 13.083f)
                lineToRelative(4.865f, -13.081f)
                curveToRelative(0.057f, -0.153f, 0.204f, -0.255f, 0.367f, -0.255f)
                horizontalLineToRelative(6.552f)
                curveToRelative(0.139f, 0.0f, 0.234f, 0.141f, 0.182f, 0.27f)
                close()
            }
        }
        .build()
        return _veed!!
    }

private var _veed: ImageVector? = null
