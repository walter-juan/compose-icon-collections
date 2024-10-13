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

public val SolidGroup.BxsMegaphone: ImageVector
    get() {
        if (_bxsMegaphone != null) {
            return _bxsMegaphone!!
        }
        _bxsMegaphone = Builder(name = "BxsMegaphone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.664f, 3.478f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(0.748f, 0.267f)
                lineToRelative(-1.127f, 2.254f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 1.156f, 2.792f)
                lineToRelative(4.084f, 1.361f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, false, 2.421f, -1.003f)
                lineToRelative(1.303f, -2.606f)
                lineToRelative(4.079f, 1.457f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 18.581f)
                lineTo(22.0f, 4.419f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.336f, -0.941f)
                close()
                moveTo(13.493f, 19.777f)
                lineTo(9.41f, 18.416f)
                lineToRelative(1.235f, -2.471f)
                lineToRelative(4.042f, 1.444f)
                lineToRelative(-1.194f, 2.388f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsMegaphone!!
    }

private var _bxsMegaphone: ImageVector? = null
