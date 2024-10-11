package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.DropboxLine: ImageVector
    get() {
        if (_dropboxLine != null) {
            return _dropboxLine!!
        }
        _dropboxLine = Builder(name = "DropboxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.65f, 17.261f)
                lineTo(12.042f, 19.422f)
                lineTo(15.434f, 17.261f)
                lineTo(17.294f, 18.446f)
                lineTo(12.042f, 21.792f)
                lineTo(6.79f, 18.446f)
                lineTo(8.65f, 17.261f)
                close()
                moveTo(7.774f, 8.98f)
                lineTo(10.167f, 7.427f)
                lineTo(7.741f, 5.854f)
                lineTo(5.286f, 7.37f)
                lineTo(7.774f, 8.98f)
                close()
                moveTo(9.613f, 10.171f)
                lineTo(12.005f, 11.718f)
                lineTo(14.395f, 10.171f)
                lineTo(12.004f, 8.619f)
                lineTo(9.613f, 10.171f)
                close()
                moveTo(13.845f, 12.91f)
                lineTo(16.269f, 14.478f)
                lineTo(18.719f, 12.976f)
                lineTo(16.233f, 11.364f)
                lineTo(13.845f, 12.91f)
                close()
                moveTo(12.004f, 6.235f)
                lineTo(16.241f, 3.487f)
                lineTo(22.466f, 7.33f)
                lineTo(18.073f, 10.173f)
                lineTo(22.467f, 13.024f)
                lineTo(16.24f, 16.842f)
                lineTo(12.005f, 14.101f)
                lineTo(7.769f, 16.842f)
                lineTo(1.54f, 13.024f)
                lineTo(5.935f, 10.173f)
                lineTo(1.543f, 7.33f)
                lineTo(7.768f, 3.487f)
                lineTo(12.004f, 6.235f)
                close()
                moveTo(13.842f, 7.427f)
                lineTo(16.235f, 8.98f)
                lineTo(18.723f, 7.37f)
                lineTo(16.268f, 5.853f)
                lineTo(13.842f, 7.427f)
                close()
                moveTo(10.164f, 12.91f)
                lineTo(7.775f, 11.363f)
                lineTo(5.289f, 12.976f)
                lineTo(7.74f, 14.478f)
                lineTo(10.164f, 12.91f)
                close()
            }
        }
        .build()
        return _dropboxLine!!
    }

private var _dropboxLine: ImageVector? = null
