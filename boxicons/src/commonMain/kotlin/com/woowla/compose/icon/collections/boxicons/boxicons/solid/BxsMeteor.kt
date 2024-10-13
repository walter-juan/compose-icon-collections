package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMeteor: ImageVector
    get() {
        if (_bxsMeteor != null) {
            return _bxsMeteor!!
        }
        _bxsMeteor = Builder(name = "BxsMeteor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.507f, 2.138f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.155f, 0.102f)
                lineTo(4.196f, 9.197f)
                curveToRelative(-2.924f, 2.924f, -2.924f, 7.682f, 0.0f, 10.606f)
                arcToRelative(7.472f, 7.472f, 0.0f, false, false, 5.3f, 2.192f)
                curveToRelative(1.924f, 0.0f, 3.85f, -0.734f, 5.317f, -2.202f)
                lineToRelative(6.903f, -7.096f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 11.0f)
                horizontalLineToRelative(-3.301f)
                lineToRelative(4.175f, -7.514f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.359f, -1.36f)
                lineToRelative(-7.11f, 3.95f)
                lineToRelative(0.576f, -2.879f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.474f, -1.059f)
                close()
                moveTo(14.0f, 14.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                curveToRelative(0.0f, -1.57f, 0.807f, -2.949f, 2.025f, -3.754f)
                curveToRelative(-0.01f, 0.084f, -0.025f, 0.167f, -0.025f, 0.254f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.845f, -0.772f)
                curveTo(12.669f, 10.802f, 14.0f, 12.486f, 14.0f, 14.5f)
                close()
            }
        }
        .build()
        return _bxsMeteor!!
    }

private var _bxsMeteor: ImageVector? = null
