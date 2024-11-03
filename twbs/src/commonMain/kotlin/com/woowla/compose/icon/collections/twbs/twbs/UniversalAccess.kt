package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveTo(6.0f, 5.5f)
                lineToRelative(-4.535f, -0.442f)
                arcTo(0.531f, 0.531f, 0.0f, false, true, 1.531f, 4.0f)
                horizontalLineTo(14.47f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, true, 0.066f, 1.058f)
                lineTo(10.0f, 5.5f)
                verticalLineTo(9.0f)
                lineToRelative(0.452f, 6.42f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -1.053f, 0.174f)
                lineTo(8.243f, 9.97f)
                curveToRelative(-0.064f, -0.252f, -0.422f, -0.252f, -0.486f, 0.0f)
                lineToRelative(-1.156f, 5.624f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -1.053f, -0.174f)
                lineTo(6.0f, 9.0f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
