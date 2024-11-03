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

public val Twbs.GearWide: ImageVector
    get() {
        if (_gearWide != null) {
            return _gearWide!!
        }
        _gearWide = Builder(name = "GearWide", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.932f, 0.727f)
                curveToRelative(-0.243f, -0.97f, -1.62f, -0.97f, -1.864f, 0.0f)
                lineToRelative(-0.071f, 0.286f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.622f, 0.434f)
                lineToRelative(-0.205f, -0.211f)
                curveToRelative(-0.695f, -0.719f, -1.888f, -0.03f, -1.613f, 0.931f)
                lineToRelative(0.08f, 0.284f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.186f, 1.187f)
                lineToRelative(-0.284f, -0.081f)
                curveToRelative(-0.96f, -0.275f, -1.65f, 0.918f, -0.931f, 1.613f)
                lineToRelative(0.211f, 0.205f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -0.434f, 1.622f)
                lineToRelative(-0.286f, 0.071f)
                curveToRelative(-0.97f, 0.243f, -0.97f, 1.62f, 0.0f, 1.864f)
                lineToRelative(0.286f, 0.071f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.434f, 1.622f)
                lineToRelative(-0.211f, 0.205f)
                curveToRelative(-0.719f, 0.695f, -0.03f, 1.888f, 0.931f, 1.613f)
                lineToRelative(0.284f, -0.08f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 1.187f, 1.187f)
                lineToRelative(-0.081f, 0.283f)
                curveToRelative(-0.275f, 0.96f, 0.918f, 1.65f, 1.613f, 0.931f)
                lineToRelative(0.205f, -0.211f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 1.622f, 0.434f)
                lineToRelative(0.071f, 0.286f)
                curveToRelative(0.243f, 0.97f, 1.62f, 0.97f, 1.864f, 0.0f)
                lineToRelative(0.071f, -0.286f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 1.622f, -0.434f)
                lineToRelative(0.205f, 0.211f)
                curveToRelative(0.695f, 0.719f, 1.888f, 0.03f, 1.613f, -0.931f)
                lineToRelative(-0.08f, -0.284f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 1.187f, -1.187f)
                lineToRelative(0.283f, 0.081f)
                curveToRelative(0.96f, 0.275f, 1.65f, -0.918f, 0.931f, -1.613f)
                lineToRelative(-0.211f, -0.205f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.434f, -1.622f)
                lineToRelative(0.286f, -0.071f)
                curveToRelative(0.97f, -0.243f, 0.97f, -1.62f, 0.0f, -1.864f)
                lineToRelative(-0.286f, -0.071f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -0.434f, -1.622f)
                lineToRelative(0.211f, -0.205f)
                curveToRelative(0.719f, -0.695f, 0.03f, -1.888f, -0.931f, -1.613f)
                lineToRelative(-0.284f, 0.08f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.187f, -1.186f)
                lineToRelative(0.081f, -0.284f)
                curveToRelative(0.275f, -0.96f, -0.918f, -1.65f, -1.613f, -0.931f)
                lineToRelative(-0.205f, 0.211f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.622f, -0.434f)
                close()
                moveTo(8.0f, 12.997f)
                arcToRelative(4.998f, 4.998f, 0.0f, true, true, 0.0f, -9.995f)
                arcToRelative(4.998f, 4.998f, 0.0f, false, true, 0.0f, 9.996f)
                close()
            }
        }
        .build()
        return _gearWide!!
    }

private var _gearWide: ImageVector? = null
